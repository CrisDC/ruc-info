package com.unmsm.edu.pe.sunat.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.unmsm.edu.pe.proxy.SunatProxy;
import com.unmsm.edu.pe.sunat.model.proxy.Person;
import com.unmsm.edu.pe.sunat.service.SunatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SunatServiceImpl implements SunatService {

    private final SunatProxy sunatProxy;

    @Override
    public Person getPersonByRuc(String rucNumber) {
        try {
            return this.sunatProxy.getPersonByRuc(rucNumber);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
