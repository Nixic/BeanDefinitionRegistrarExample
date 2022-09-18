package ru.nixic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.nixic.model.Level;
import ru.nixic.service.MyImportBeanDefinitionRegistrar;
import ru.nixic.service.export.ExportService;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
@Import(MyImportBeanDefinitionRegistrar.class)
public class ApplicationTestConfig {

    /**
     * Map with services and their levels.
     *
     * @param services list of servisec
     * @return map
     */
    @Bean
    public Map<Level, ExportService> exportSchemaSrcServiceMap(List<ExportService> services) {
        return services.stream()
                .collect(Collectors.toMap(ExportService::ownLevel, Function.identity()));
    }
}
