package com.gsuretech.gsuretechbank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Quick Pay App",
                description = "Backend Rest APIs for Quick Pay",
                version = "v1.0",
                contact = @Contact(
                        name = "Gsuretech",
                        email = "Tech@gmail.com",
                        url = "https://github.com/Gsure-tech/Quickpay.git"
                ),
                license = @License(
                        name = "Gsure-tech",
                        url = "https://github.com/Gsure-tech/Quickpay.git"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Quick Pay App Documentation",
                url = "https://github.com/Gsure-tech/Quickpay.git"
        ),
        // This applies the security requirement globally to every endpoint on the UI
        security = {
                @SecurityRequirement(name = "bearerAuth")
        }
)
@SecurityScheme(
        name = "bearerAuth",
        description = "Please paste ONLY your raw JWT token. The 'Bearer ' prefix is appended automatically.",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class GsureTechBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(GsureTechBankApplication.class, args);
    }

}