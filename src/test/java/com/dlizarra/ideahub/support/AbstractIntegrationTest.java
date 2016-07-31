package com.dlizarra.ideahub.support;

import com.dlizarra.ideahub.AppConfig;
import com.dlizarra.ideahub.DatabaseConfig;
import com.dlizarra.ideahub.IdeaHubProfiles;
import com.dlizarra.ideahub.SecurityConfig;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.NONE,
        classes = { AppConfig.class, DatabaseConfig.class, SecurityConfig.class })
@ActiveProfiles(IdeaHubProfiles.TEST)
public abstract class AbstractIntegrationTest {

}
