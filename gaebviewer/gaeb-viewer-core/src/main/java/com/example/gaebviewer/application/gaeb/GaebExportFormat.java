package com.example.gaebviewer.application.gaeb;

/**
 * Describes all supported export formats: the eight GAEB DA exchange phases plus PDF.
 * Use {@link #getGaebVersion()} to check whether a format is a GAEB XML format;
 * it returns {@code null} for {@link #PDF}.
 */
public enum GaebExportFormat {

    DA80("DA80 (.x80)", ".x80", GaebSchemaVersion.DA80),
    DA81("DA81 (.x81)", ".x81", GaebSchemaVersion.DA81),
    DA82("DA82 (.x82)", ".x82", GaebSchemaVersion.DA82),
    DA83("DA83 (.x83)", ".x83", GaebSchemaVersion.DA83),
    DA84("DA84 (.x84)", ".x84", GaebSchemaVersion.DA84),
    DA85("DA85 (.x85)", ".x85", GaebSchemaVersion.DA85),
    DA86("DA86 (.x86)", ".x86", GaebSchemaVersion.DA86),
    DA87("DA87 (.x87)", ".x87", GaebSchemaVersion.DA87),
    PDF("PDF (.pdf)", ".pdf", null);

    private final String label;
    private final String fileExtension;
    /** {@code null} for {@link #PDF}. */
    private final GaebSchemaVersion gaebVersion;

    GaebExportFormat(String label, String fileExtension, GaebSchemaVersion gaebVersion) {
        this.label = label;
        this.fileExtension = fileExtension;
        this.gaebVersion = gaebVersion;
    }

    public String getLabel() {
        return label;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    /** Returns the corresponding {@link GaebSchemaVersion}, or {@code null} for {@link #PDF}. */
    public GaebSchemaVersion getGaebVersion() {
        return gaebVersion;
    }

    /** {@code true} if this is a GAEB XML format (not PDF). */
    public boolean isGaebFormat() {
        return gaebVersion != null;
    }

    /**
     * Derives the matching export format from a {@link GaebSchemaVersion} string such as
     * {@code "DA86"} or a namespace URI. Falls back to {@link #DA86} when unknown.
     */
    public static GaebExportFormat fromSchemaVersion(GaebSchemaVersion version) {
        for (GaebExportFormat f : values()) {
            if (f.gaebVersion == version) return f;
        }
        return DA86;
    }
}
