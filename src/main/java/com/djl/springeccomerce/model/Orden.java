package com.djl.springeccomerce.model;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orden {

    private Integer id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibida;
    private double Total;

}
