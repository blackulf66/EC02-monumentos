package com.salesianostriana.dam._Monumentos;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Monumento {

    @Id
    @GeneratedValue
    private long Id;

    private String codigoPais;

    private String nombrePais;

    private String nombreCiudad;

    private String localizacion;

    private String nombreMonumento;

    private String descripcion;

    private String foto;

    public Monumento(String codigoPais, String nombrePais, String nombreCiudad, String localizacion, String nombreMonumento, String descripcion, String foto) {
        this.codigoPais = codigoPais;
        this.nombrePais = nombrePais;
        this.nombreCiudad = nombreCiudad;
        this.localizacion = localizacion;
        this.nombreMonumento = nombreMonumento;
        this.descripcion = descripcion;
        this.foto = foto;
    }
}
