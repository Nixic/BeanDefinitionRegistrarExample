package ru.nixic.service;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import ru.nixic.config.ApplicationTestConfig;
import ru.nixic.service.export.ExportServiceFactory;
import ru.nixic.service.export.ExportServiceLevelOne;
import ru.nixic.service.export.ExportServiceLevelThee;
import ru.nixic.service.export.ExportServiceLevelTwo;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ExportServiceFactory.class})
@ActiveProfiles("test")
@ContextConfiguration(classes = {ApplicationTestConfig.class})
class ExportServiceFactoryTest {

    @Autowired
    protected ExportServiceFactory exportServiceFactory;

    @Test
    void getService() {

        MatcherAssert.assertThat(exportServiceFactory.getService(0), Matchers.instanceOf(ExportServiceLevelOne.class));

        MatcherAssert.assertThat(exportServiceFactory.getService(1), Matchers.instanceOf(ExportServiceLevelTwo.class));

        MatcherAssert.assertThat(exportServiceFactory.getService(2), Matchers.instanceOf(ExportServiceLevelThee.class));
    }


}