package ru.nixic.service.export;

import ru.nixic.model.Level;

public class ExportServiceLevelTwo implements ExportService {

    @Override
    public String export() {
        return "Export Two!!";
    }

    @Override
    public Level ownLevel() {
        return Level.LEVEL_TWO;
    }
}
