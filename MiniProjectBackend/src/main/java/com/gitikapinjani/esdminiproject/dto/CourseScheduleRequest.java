package com.gitikapinjani.esdminiproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.*;

public record CourseScheduleRequest(

        @JsonProperty("time")
         String time,

                @JsonProperty("day")
 String day,

@JsonProperty("room")
 String room,

@JsonProperty("building")
 String building
){
}

