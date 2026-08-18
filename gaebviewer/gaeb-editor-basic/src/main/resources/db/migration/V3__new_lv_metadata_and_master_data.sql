CREATE TABLE gaeb_owner (
    id    UUID PRIMARY KEY,
    name  VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE gaeb_construction_site (
    id    UUID PRIMARY KEY,
    name  VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE gaeb_requester (
    id    UUID PRIMARY KEY,
    name  VARCHAR(255) NOT NULL UNIQUE
);

ALTER TABLE gaeb_document
    ADD COLUMN prj_id VARCHAR(100),
    ADD COLUMN name_prj VARCHAR(255),
    ADD COLUMN lbl_prj TEXT,
    ADD COLUMN boq_id VARCHAR(100),
    ADD COLUMN name_value VARCHAR(255),
    ADD COLUMN lbl_boq VARCHAR(255),
    ADD COLUMN owner_id UUID REFERENCES gaeb_owner(id),
    ADD COLUMN cnst_site_id UUID REFERENCES gaeb_construction_site(id),
    ADD COLUMN cur VARCHAR(50),
    ADD COLUMN cur_lbl VARCHAR(100),
    ADD COLUMN cpv_code VARCHAR(100),
    ADD COLUMN bid_date DATE,
    ADD COLUMN open_date DATE,
    ADD COLUMN open_time TIME,
    ADD COLUMN cnst_start DATE,
    ADD COLUMN cnst_end DATE,
    ADD COLUMN eval_end DATE,
    ADD COLUMN subm_loc VARCHAR(255),
    ADD COLUMN warr_dur VARCHAR(100),
    ADD COLUMN warr_unit VARCHAR(100),
    ADD COLUMN contr_no VARCHAR(100),
    ADD COLUMN contr_date DATE,
    ADD COLUMN requester_id UUID REFERENCES gaeb_requester(id),
    ADD COLUMN cat VARCHAR(100),
    ADD COLUMN hierarchy_level_count INTEGER NOT NULL DEFAULT 0;

CREATE TABLE gaeb_document_oz_level (
    id              UUID PRIMARY KEY,
    document_id     UUID NOT NULL REFERENCES gaeb_document(id) ON DELETE CASCADE,
    level_no        INTEGER NOT NULL,
    level_label     VARCHAR(255),
    digits          INTEGER NOT NULL,
    step            INTEGER NOT NULL,
    fill_character  VARCHAR(10),
    CONSTRAINT uq_gaeb_document_oz_level_doc_level UNIQUE (document_id, level_no)
);
