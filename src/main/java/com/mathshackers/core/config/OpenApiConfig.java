package com.mathshackers.core.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Value("${swagger.title:Maths Hackers Service API}")
    private String title;

    @Value("${swagger.api.info.version:1.0}")
    private String apiInfoVersion;

    @Value("${swagger.description: Maths Hackers services}")
    private String description;

    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(apiInfo());
    }

    private Info apiInfo() {

        return new Info()
                .title(title)
                .description(description)
                .version(apiInfoVersion)
                .license(new License().name("Maths Hackers.com"))
                .contact(new Contact().email("rajspselva@gmail.com"));
    }


}
