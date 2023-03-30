package com.example.microservice_03.service1;

import com.example.microservice_03.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumeWebService1 {

    @Autowired
    RestTemplate template;

    public City getCity(int id) {
        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity entity = new HttpEntity<>(headers);

        ResponseEntity<City> response = template.exchange("https://api.zippopotam.us/us/" + id, HttpMethod.GET, entity, City.class);
        System.out.println(template.getForObject("https://api.zippopotam.us/us/" + id, String.class));

        System.out.println(response.getBody());
        return response.getBody();
    }
}
