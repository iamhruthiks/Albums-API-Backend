package com.example.SpringRestDemo.config;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.*;

@Configuration
@OpenAPIDefinition(
  info =@Info(
    title = "Demo API",
    version = "v0",
    contact = @Contact(
      name = "hruthik s", email = "demo@gmail.com", url = "https://github.com/iamhruthiks"
    ),
    license = @License(
      name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"
    ),
    termsOfService = "https://github.com/iamhruthiks",
    description = "Spring Boot RestFul API Demo by hruthik s"
  )
)

public class SwaggerConfig {
}
