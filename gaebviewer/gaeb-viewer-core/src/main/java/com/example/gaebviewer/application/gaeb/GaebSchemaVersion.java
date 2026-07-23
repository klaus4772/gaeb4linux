package com.example.gaebviewer.application.gaeb;

public enum GaebSchemaVersion {
    DA80("80", ".x80"),
    DA81("81", ".x81"),
    DA82("82", ".x82"),
    DA83("83", ".x83"),
    DA84("84", ".x84"),
    DA85("85", ".x85"),
    DA86("86", ".x86"),
    DA87("87", ".x87"),
    UNKNOWN("??", ".xml");

    private final String daNumber;
    private final String fileExtension;

    GaebSchemaVersion(String daNumber, String fileExtension) {
        this.daNumber = daNumber;
        this.fileExtension = fileExtension;
    }

    /** The two-digit DA exchange-phase number, e.g. {@code "86"} for DA86. */
    public String getDaNumber() {
        return daNumber;
    }

    /** The canonical file extension for this format, e.g. {@code ".x86"}. */
    public String getFileExtension() {
        return fileExtension;
    }

    /**
     * The namespace URI base (without minor version), e.g.
     * {@code "http://www.gaeb.de/GAEB_DA_XML/DA86"}.
     * Returns {@code null} for {@link #UNKNOWN}.
     */
    public String getNamespaceBase() {
        if (this == UNKNOWN) return null;
        return "http://www.gaeb.de/GAEB_DA_XML/DA" + daNumber;
    }

    /**
     * Tries to resolve a version from a string like {@code "DA86"}, a namespace URI
     * or any string containing {@code "DA8x"}. Returns {@link #UNKNOWN} on no match.
     */
    public static GaebSchemaVersion fromString(String s) {
        if (s == null || s.isBlank()) return UNKNOWN;
        String upper = s.toUpperCase();
        for (GaebSchemaVersion v : values()) {
            if (v == UNKNOWN) continue;
            if (upper.contains("DA" + v.daNumber)) return v;
        }
        return UNKNOWN;
    }
}