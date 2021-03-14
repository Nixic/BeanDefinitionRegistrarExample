package ru.nixic.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nixic.service.MainExportService;

import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("export")
@AllArgsConstructor
public class ExportController {

    private final MainExportService mainExportService;

    @GetMapping(value = "{id}")
    public String exportBySchema(@PathVariable("id") @NotBlank Integer schemaDtoId) {
        return mainExportService.exportBySchemaDtoId(schemaDtoId);
    }

}
