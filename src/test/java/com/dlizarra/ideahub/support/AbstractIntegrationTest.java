package com.dlizarra.ideahub.support;

import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dlizarra.ideahub.AppConfig;
import com.dlizarra.ideahub.DatabaseConfig;
import com.dlizarra.ideahub.SecurityConfig;
import com.dlizarra.ideahub.IdeaHubProfiles;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { AppConfig.class, DatabaseConfig.class, SecurityConfig.class })
@IntegrationTest
@ActiveProfiles(IdeaHubProfiles.TEST)
public abstract class AbstractIntegrationTest {

}
