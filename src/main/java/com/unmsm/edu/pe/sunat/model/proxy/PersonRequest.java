package com.unmsm.edu.pe.sunat.model.proxy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonRequest {

    private String ruc;
    private String token;

}
