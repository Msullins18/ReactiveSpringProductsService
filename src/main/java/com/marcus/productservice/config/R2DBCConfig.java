package com.marcus.productservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;

@Configuration
public class R2DBCConfig {

    @Bean
    ConnectionFactory connectionFactory() {
        return ConnectionFactories.get(
                ConnectionFactoryOptions.builder()
                        .option(ConnectionFactoryOptions.DRIVER, "postgresql")
                        .option(ConnectionFactoryOptions.HOST, "localhost")
                        .option(ConnectionFactoryOptions.PORT, 5432)
                        .option(ConnectionFactoryOptions.USER, "postgres")
                        .option(ConnectionFactoryOptions.PASSWORD, "admin")
                        .option(ConnectionFactoryOptions.DATABASE, "postgres")
                        .build());
    }

}
