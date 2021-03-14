package ru.nixic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.nixic.model.Level;
import ru.nixic.repository.SchemaRepository;

import java.util.Map;

@Component
public class ServiceFactory {

    private final Map<Level, ExportService> exportSchemaSrcServiceMap;
    private final SchemaRepository repository;

    @Autowired
    public ServiceFactory(Map<Level, ExportService> exportSchemaSrcServiceMap, SchemaRepository repository) {
        this.exportSchemaSrcServiceMap = exportSchemaSrcServiceMap;
        this.repository = repository;
    }

    public ExportService getService(Integer id) {
        final Level level = repository.getSchemaDtoById(id).getLevel();
        return exportSchemaSrcServiceMap.getOrDefault(level, null);
    }


}
