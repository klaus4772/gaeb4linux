ALTER TABLE gaeb_document
    ADD COLUMN project_number VARCHAR(50);
ALTER TABLE gaeb_document
    ADD COLUMN source VARCHAR(20);
ALTER TABLE gaeb_document
    ADD COLUMN is_editable BOOLEAN;
ALTER TABLE gaeb_document
    ADD COLUMN working_filename VARCHAR(255);

UPDATE gaeb_document
SET project_number = 'LEGACY-' || id::text,
    source = 'upload',
    is_editable = TRUE
WHERE project_number IS NULL;

ALTER TABLE gaeb_document
    ALTER COLUMN project_number SET NOT NULL;
ALTER TABLE gaeb_document
    ALTER COLUMN source SET NOT NULL;
ALTER TABLE gaeb_document
    ALTER COLUMN is_editable SET NOT NULL;

ALTER TABLE gaeb_document
    ADD CONSTRAINT uq_gaeb_document_project_number UNIQUE (project_number);

CREATE TABLE gaeb_editor_settings (
    id                       INTEGER PRIMARY KEY,
    project_number_prefix    VARCHAR(20) NOT NULL,
    project_number_digits    INTEGER NOT NULL
);

CREATE TABLE gaeb_project_number_counter (
    id          INTEGER PRIMARY KEY,
    next_value  BIGINT NOT NULL
);

CREATE TABLE gaeb_editor_setting_option (
    id            UUID PRIMARY KEY,
    option_key    VARCHAR(50) NOT NULL,
    option_value  VARCHAR(255) NOT NULL,
    sort_order    INTEGER NOT NULL
);

CREATE UNIQUE INDEX uq_gaeb_editor_setting_option_key_value
    ON gaeb_editor_setting_option(option_key, option_value);

CREATE INDEX idx_gaeb_editor_setting_option_key_sort
    ON gaeb_editor_setting_option(option_key, sort_order);

INSERT INTO gaeb_editor_settings(id, project_number_prefix, project_number_digits)
VALUES (1, 'P', 5);

INSERT INTO gaeb_project_number_counter(id, next_value)
VALUES (1, 1);
