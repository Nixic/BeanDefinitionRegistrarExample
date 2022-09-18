package ru.nixic.service.export;

import ru.nixic.model.Level;

public class ExportServiceLevelThee implements ExportService {

    @Override
    public String export() {
        return "Export Three!!!";
    }

    @Override
    public Level ownLevel() {
        return Level.LEVEL_THREE;
    }
}
