package com.bookstore.base;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.models.auth.ApiKeyAuthDefinition;
import io.swagger.models.auth.In;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class JAXRSConfiguration extends Application {

	public JAXRSConfiguration() {
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.getSwagger().addSecurityDefinition("api_key", new ApiKeyAuthDefinition("api_key", In.HEADER));
		beanConfig.setSchemes(new String[] { "http" });
		beanConfig.setBasePath("jee_practice/api");
		beanConfig.setResourcePackage("com.bookstore.rest");
		beanConfig.setScan(true);
	}
}
