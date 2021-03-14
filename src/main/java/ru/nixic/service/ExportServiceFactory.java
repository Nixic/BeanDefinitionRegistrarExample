package ru.nixic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.nixic.model.Level;
import ru.nixic.repository.SchemaRepository;

import java.util.Map;

@Component
public class ExportServiceFactory {

    private final Map<Level, ExportService> exportSchemaSrcServiceMap;
    private final SchemaRepository repository;

    @Autowired
    public ExportServiceFactory(Map<Level, ExportService> exportSchemaSrcServiceMap) {
        this.exportSchemaSrcServiceMap = exportSchemaSrcServiceMap;
        this.repository = new SchemaRepository();
    }

    public ExportService getService(Integer id) {
        final Level level = repository.getSchemaDtoById(id).getLevel();
        return exportSchemaSrcServiceMap.getOrDefault(level, null);
    }


}
