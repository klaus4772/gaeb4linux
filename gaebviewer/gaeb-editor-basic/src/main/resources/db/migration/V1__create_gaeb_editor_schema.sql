-- Temporary storage for GAEB files opened in the editor.
--
-- gaeb_document holds the untouched original file exactly as imported (original_content),
-- so it can always be reproduced byte-for-byte even after the LV has been edited or deleted
-- from the working tables below.
--
-- gaeb_editor_position / gaeb_editor_text_complement are an editable, structured mirror of
-- the positions contained in that original file (quantities, units, texts, Ordnungszahl, ...).
-- This is what the editor UI reads and writes.
--
-- gaeb_editor_position_extra is intentionally a separate table: it holds editor-only
-- information that has no counterpart in the original GAEB file (notes, review status, ...).
-- Dropping it never affects the ability to reconstruct the original document or its positions.

CREATE TABLE gaeb_document (
    id                        UUID PRIMARY KEY,
    original_filename         VARCHAR(255),
    gaeb_version              VARCHAR(20),
    currency_code             VARCHAR(3),
    project_name              VARCHAR(255),
    original_content          BYTEA NOT NULL,
    original_checksum_sha256  VARCHAR(64) NOT NULL,
    imported_at               TIMESTAMP NOT NULL
);

CREATE TABLE gaeb_editor_position (
    id                        UUID PRIMARY KEY,
    document_id               UUID NOT NULL REFERENCES gaeb_document(id) ON DELETE CASCADE,
    boq_index                 INTEGER NOT NULL,
    boq_title                 VARCHAR(255),
    sort_order                INTEGER NOT NULL,
    position_number           VARCHAR(100),
    original_position_number  VARCHAR(100),
    short_text                VARCHAR(1000),
    long_text                 TEXT,
    quantity                  NUMERIC(18,4),
    unit                      VARCHAR(20),
    unit_price                NUMERIC(18,4),
    deleted                   BOOLEAN NOT NULL DEFAULT FALSE,
    copied_from_position_id   UUID REFERENCES gaeb_editor_position(id),
    created_at                TIMESTAMP NOT NULL,
    updated_at                TIMESTAMP NOT NULL
);

CREATE INDEX idx_gaeb_editor_position_document ON gaeb_editor_position(document_id);
CREATE INDEX idx_gaeb_editor_position_document_sort ON gaeb_editor_position(document_id, sort_order);

CREATE TABLE gaeb_editor_text_complement (
    id           UUID PRIMARY KEY,
    position_id  UUID NOT NULL REFERENCES gaeb_editor_position(id) ON DELETE CASCADE,
    mark_label   VARCHAR(100),
    caption      VARCHAR(255),
    body         TEXT,
    placeholder  VARCHAR(255),
    tail         VARCHAR(255),
    required     BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE INDEX idx_gaeb_editor_text_complement_position ON gaeb_editor_text_complement(position_id);

CREATE TABLE gaeb_editor_position_extra (
    id                UUID PRIMARY KEY,
    position_id       UUID NOT NULL UNIQUE REFERENCES gaeb_editor_position(id) ON DELETE CASCADE,
    note              TEXT,
    review_status     VARCHAR(50),
    last_modified_by  VARCHAR(255),
    last_modified_at  TIMESTAMP
);
