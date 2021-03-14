package ru.nixic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.nixic.model.Level;
import ru.nixic.service.ExportService;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
public class ApplicationConfig {

    @Bean
    public Map<Level, ExportService> exportSchemaSrcServiceMap(List<ExportService> services) {
        final Map<Level, ExportService> map = services.stream()
                .collect(Collectors.toMap(ExportService::ownLevel, Function.identity()));
        return map;
    }

}
