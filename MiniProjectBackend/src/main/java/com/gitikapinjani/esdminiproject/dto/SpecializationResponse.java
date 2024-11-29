package com.gitikapinjani.esdminiproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record SpecializationResponse (

            @JsonProperty("specialization_id")
            Long specializationId,

            @JsonProperty("code")
            String code,

            @JsonProperty("name")
            String name,

            @JsonProperty("description")
            String description,

            @JsonProperty("year")
            String year,

            @JsonProperty("credits_required")
            String creditsRequired

){}

