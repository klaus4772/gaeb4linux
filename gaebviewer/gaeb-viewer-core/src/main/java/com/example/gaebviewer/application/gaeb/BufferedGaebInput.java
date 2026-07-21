package com.example.gaebviewer.application.gaeb;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class BufferedGaebInput {
    private final byte[] data;

    private BufferedGaebInput(byte[] data) {
        this.data = data;
    }

    public static BufferedGaebInput from(InputStream in) {
        try {
            return new BufferedGaebInput(in.readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException("Failed to read GAEB input stream", e);
        }
    }

    public InputStream newStream() {
        return new ByteArrayInputStream(data);
    }

    public byte[] bytes() {
        return data;
    }
}