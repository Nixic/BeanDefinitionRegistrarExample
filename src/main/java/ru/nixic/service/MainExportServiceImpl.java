package ru.nixic.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MainExportServiceImpl implements MainExportService {

    private final ExportServiceFactory exportServiceFactory;

    @Override
    public String exportBySchemaDtoId(Integer id) throws RuntimeException {
        final ExportService service = exportServiceFactory.getService(id);
        return service.export();
    }
}
