package com.gsuretech.gsuretechbank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Quick Pay App",
                description = "Backend Rest APIs for Quick Pay",
                version = "v1.0",
                contact = @Contact(
                        name = "Abdulganiyu Abubakar",
                        email = "abubakarabdul9023@gmail.com",
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
        )
)
public class GsureTechBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(GsureTechBankApplication.class, args);
    }

}
