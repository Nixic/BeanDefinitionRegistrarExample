package ru.nixic.service;

import org.springframework.stereotype.Service;
import ru.nixic.model.Level;

@Service
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
