package com.example.gaebviewer.core.gaeb.service;

import com.example.gaebviewer.core.gaeb.parser.GaebXmlParser;
import com.example.gaebviewer.core.model.Position;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class GaebImportService {

    private final GaebXmlParser parser;

    public GaebImportService(GaebXmlParser parser) {
        this.parser = parser;
    }

    public List<Position> importGaeb(InputStream inputStream) {
        return parser.parse(inputStream);
    }
}
