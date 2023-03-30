package com.example.microservice_03.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Places {

    @JsonProperty("place name")
    private String name;
    private double longitude;
    private String state;
    @JsonProperty("state abbreviation")
    private String abbr;
    private double latitude;
}
