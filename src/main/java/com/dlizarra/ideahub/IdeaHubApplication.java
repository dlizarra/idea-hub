package com.dlizarra.ideahub;

import org.springframework.boot.SpringApplication;
import org.springframework.core.env.ConfigurableEnvironment;

public class IdeaHubApplication extends SpringApplication {

	public IdeaHubApplication(final Class<?> clazz) {
		super(clazz);
	}

	@Override
	protected void configureProfiles(final ConfigurableEnvironment environment, final String[] args) {
		super.configureProfiles(environment, args);

		final boolean standaloneActive = environment.acceptsProfiles(IdeaHubProfiles.STANDALONE);
		final boolean stagingActive = environment.acceptsProfiles(IdeaHubProfiles.STAGING);
		final boolean productionActive = environment.acceptsProfiles(IdeaHubProfiles.PRODUCTION);

		if (stagingActive && productionActive) {
			throw new IllegalStateException("Cannot activate staging and production profiles at the same time.");
		} else if (productionActive || stagingActive) {
			System.out.println("Activating " +
					(productionActive ? IdeaHubProfiles.PRODUCTION : IdeaHubProfiles.STAGING) + " profile.");
		} else if (standaloneActive) {
			System.out.println("Activating " +
					"the default standalone profile.");
		} else {
			throw new IllegalStateException(
					"Unknown profiles specified. Please specify one of default, staging or production.");
		}
	}

}
