package com.djl.springeccomerce.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibida;
    private double Total;
    @ManyToOne
    private Usuario usuario;
    @OneToOne (mappedBy = "orden")
    private DetalleOrden detalle;

}
