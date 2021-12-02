package com.unmsm.edu.pe.web;

import com.unmsm.edu.pe.sunat.model.proxy.Person;
import com.unmsm.edu.pe.sunat.service.SunatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sunat")
public class SunatController {

    private final SunatService sunatService;

    @GetMapping("/person")
    public Person getPersonByRuc(@RequestParam String ruc) {
        return this.sunatService.getPersonByRuc(ruc);
    }

}
