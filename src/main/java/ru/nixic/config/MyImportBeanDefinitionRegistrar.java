package ru.nixic.config;

import org.reflections.Reflections;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import ru.nixic.service.export.ExportService;

import java.beans.Introspector;
import java.util.Set;

/**
 * Registrar for all classes implementing ExportService
 */
public class MyImportBeanDefinitionRegistrar  implements ImportBeanDefinitionRegistrar {

    /**
     * Registers all implementations of ExportService.class.
     * @param importingClassMetadata not used here
     * @param registry Registry of beans definition
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Reflections reflections = new Reflections(ExportService.class.getPackage().getName());
        final Set<Class<? extends ExportService>> classesToRegister = reflections.getSubTypesOf(ExportService.class);
        for (Class<? extends ExportService> aClass : classesToRegister) {
            final GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
            genericBeanDefinition.setBeanClass(aClass);
            genericBeanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
            registry.registerBeanDefinition(Introspector.decapitalize(aClass.getSimpleName()), genericBeanDefinition);
        }
    }
}
