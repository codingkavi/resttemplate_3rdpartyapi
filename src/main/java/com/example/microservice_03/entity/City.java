package com.example.microservice_03.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
;import java.util.List;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class City {

    @JsonProperty("post code")
    private int zip;
    private String country;
    @JsonProperty("country abbreviation")
    private String abbreviation;
    private List<Places> places;

}
