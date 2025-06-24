package com.IdealRein.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("MiniCMS API 文档")
                .version("1.0.0")
                .description("基于 Spring Boot 的内容管理系统后端接口文档。"));
    }
}
