package com.gitikapinjani.esdminiproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gitikapinjani.esdminiproject.entity.Employees;
import jakarta.validation.constraints.*;

public record LoginResponse(


        Employees employees,

        @NotNull(message = "Password should be present")
        @NotEmpty(message = "Password should be present")
        @NotBlank(message = "Password should be present")
        @Size(min = 6, max = 12)
        @JsonProperty("password")
        String password
) {
}

