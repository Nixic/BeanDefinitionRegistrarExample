package ru.nixic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.nixic.model.Level;
import ru.nixic.service.MyImportBeanDefinitionRegistrar;
import ru.nixic.service.ExportService;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
@Import(MyImportBeanDefinitionRegistrar.class)
public class ApplicationTestConfig {

    /**
     * Мапа соотношения типа уровня схемы и сервиса который будет генерировать экспортируемые данные
     *
     * @param services список всех сервисов для генерации
     * @return мапу соотношений уровень схемы - сервис.
     */
    @Bean
    public Map<Level, ExportService> exportSchemaSrcServiceMap(List<ExportService> services) {
        final Map<Level, ExportService> map = services.stream()
                .collect(Collectors.toMap(ExportService::ownLevel, Function.identity()));
        return map;
    }
}
