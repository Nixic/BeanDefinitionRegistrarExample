package ru.nixic.service;

import org.springframework.stereotype.Service;
import ru.nixic.dto.SchemaDto;
import ru.nixic.model.Level;

@Service
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
