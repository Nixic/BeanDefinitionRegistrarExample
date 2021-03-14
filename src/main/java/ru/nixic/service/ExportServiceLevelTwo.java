package ru.nixic.service;

import org.springframework.stereotype.Service;
import ru.nixic.model.Level;

@Service
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
