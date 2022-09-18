package ru.nixic.service.export;

import ru.nixic.model.Level;

public class ExportServiceLevelOne implements ExportService {

    @Override
    public String export() {
        return "Export One!";
    }

    @Override
    public Level ownLevel() {
        return Level.LEVEL_ONE;
    }
}
