package com.example.SpringRestDemo.payload.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class PasswordDTO {

    @Size(min = 6, max = 20)
    @Schema(description = "Password", example = "password", maxLength = 20, minLength = 6)
    private String password;
}
