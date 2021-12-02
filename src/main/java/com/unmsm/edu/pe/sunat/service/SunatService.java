package com.unmsm.edu.pe.sunat.service;

import com.unmsm.edu.pe.sunat.model.proxy.Person;

public interface SunatService {

    Person getPersonByRuc(String rucNumber);

}
