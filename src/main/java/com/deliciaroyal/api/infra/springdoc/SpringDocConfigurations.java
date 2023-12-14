package com.deliciaroyal.api.infra.springdoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfigurations {
	
	@Bean
	public OpenAPI customOpenAPI() {
	    return new OpenAPI()
	            .components(new Components()
	                    .addSecuritySchemes("bearer-key",
	                            new SecurityScheme()
	                                    .type(SecurityScheme.Type.HTTP)
	                                    .scheme("bearer")
	                                    .bearerFormat("JWT")))
	                    .info(new Info()
	                            .title("API Delicia Royal")
	                            .description("API Rest da aplicação Deliciar Royal")
	                            .contact(new Contact()
	                                    .name("Time Backend")
	                                    .email("matheuscostav@ourlook.com"))
	                    .license(new License()
	                            .name("Linkedin")
	                            .url("https://www.linkedin.com/in/matheuscostavaz/")));
	}
}
