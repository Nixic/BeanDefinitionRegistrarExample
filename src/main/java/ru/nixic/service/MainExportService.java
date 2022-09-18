package ru.nixic.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nixic.service.export.ExportService;
import ru.nixic.service.export.ExportServiceFactory;

@Service
@AllArgsConstructor
public class MainExportService {

    private final ExportServiceFactory exportServiceFactory;

    public String exportBySchemaDtoId(Integer id) throws RuntimeException {
        final ExportService service = exportServiceFactory.getService(id);
        return service.export();
    }
}
