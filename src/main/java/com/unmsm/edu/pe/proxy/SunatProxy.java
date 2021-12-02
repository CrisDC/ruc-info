package com.unmsm.edu.pe.proxy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.unmsm.edu.pe.config.SunatProperties;
import com.unmsm.edu.pe.sunat.model.proxy.Person;
import com.unmsm.edu.pe.sunat.model.proxy.PersonRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class SunatProxy {

    private final RestTemplate restTemplate;
    private final SunatProperties sunatProperties;

    public Person getPersonByRuc(String rucNumber) throws JsonProcessingException {
        PersonRequest personRequest = new PersonRequest();
        personRequest.setRuc(rucNumber);
        personRequest.setToken(sunatProperties.getToken());

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(personRequest);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> request = new HttpEntity<>(json, httpHeaders);

        return this.restTemplate.postForObject(sunatProperties.getBaseUrl(), request, Person.class);
    }

}
