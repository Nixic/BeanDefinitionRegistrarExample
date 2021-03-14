package ru.nixic.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nixic.exception.BadRequestException;

import java.util.Objects;

@Service
@AllArgsConstructor
public class MainExportServiceImpl implements MainExportService {

    private final ServiceFactory serviceFactory;

    @Override
    public String exportBySchemaDtoId(Integer id) throws RuntimeException {
        final ExportService service = serviceFactory.getService(id);
        return service.export();
    }
}
