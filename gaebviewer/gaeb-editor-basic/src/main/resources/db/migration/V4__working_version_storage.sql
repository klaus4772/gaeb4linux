ALTER TABLE gaeb_document
    ADD COLUMN working_content BYTEA,
    ADD COLUMN working_checksum_sha256 VARCHAR(64),
    ADD COLUMN working_updated_at TIMESTAMP;

UPDATE gaeb_document
SET working_content = original_content,
    working_checksum_sha256 = original_checksum_sha256,
    working_updated_at = imported_at
WHERE working_content IS NULL;

ALTER TABLE gaeb_document
    ALTER COLUMN working_content SET NOT NULL,
    ALTER COLUMN working_checksum_sha256 SET NOT NULL,
    ALTER COLUMN working_updated_at SET NOT NULL;
