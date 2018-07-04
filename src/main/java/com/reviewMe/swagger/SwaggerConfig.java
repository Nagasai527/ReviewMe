/**
 * 
 */
package com.reviewMe.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author nnaruman
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.apiInfo(getApiInfo())
        		.useDefaultResponseMessages(true)
                .select().apis(RequestHandlerSelectors.basePackage("com.reviewMe.controller"))
                .paths(PathSelectors.any())
                .build();
    }
	
	private ApiInfo getApiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "ReviewMe APIs",
                "Spring Boot REST API for ReviewMe App",
                "2.0",
                "Terms of service",
                new Contact("Naga Sai", "", "nagasai.dp@gmail.com"),
               "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
        return apiInfo;
    }
}
