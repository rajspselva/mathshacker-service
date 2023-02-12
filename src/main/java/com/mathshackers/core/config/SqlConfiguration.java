package com.mathshackers.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories({"com.mathshackers.core.repository"})
public class SqlConfiguration {

}
