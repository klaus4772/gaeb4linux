package com.example.gaebviewer.application.editor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

public record NewLvCreationCommand(
        String namePrj,
        String lblPrj,
        String boqId,
        String name,
        String lblBoq,
        UUID ownerId,
        UUID constructionSiteId,
        String cur,
        String curLbl,
        String cpvCode,
        LocalDate bidDate,
        LocalDate openDate,
        LocalTime openTime,
        LocalDate cnstStart,
        LocalDate cnstEnd,
        LocalDate evalEnd,
        String submLoc,
        String warrDur,
        String warrUnit,
        String contrNo,
        LocalDate contrDate,
        UUID requesterId,
        String cat,
        List<NewLvOzLevelCommand> ozLevels
) {
}
