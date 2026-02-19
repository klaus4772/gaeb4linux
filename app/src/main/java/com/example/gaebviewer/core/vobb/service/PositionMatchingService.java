package com.example.gaebviewer.core.vobb.service;

import com.example.gaebviewer.core.model.Position;
import com.example.gaebviewer.core.vobb.csv.CsvRow;
import com.example.gaebviewer.core.vobb.model.PositionAbrechnung;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PositionMatchingService {

    public List<PositionAbrechnung> match(
            List<Position> positions,
            List<CsvRow> rows
    ) {

        Map<String, Position> positionMap =
                positions.stream()
                        .collect(Collectors.toMap(Position::getNumber, p -> p));

        return rows.stream()
                .filter(r -> positionMap.containsKey(r.getOz()))
                .map(r -> {
                    Position position = positionMap.get(r.getOz());

                    PositionAbrechnung abrechnung =
                            new PositionAbrechnung(position);

                    abrechnung.setInvoicedQuantity(r.getInvoicedQuantity());
                    abrechnung.setInvoicedAmount(r.getInvoicedAmount());

                    return abrechnung;
                })
                .collect(Collectors.toList());
    }
}
