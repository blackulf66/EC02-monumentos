package com.salesianostriana.dam._Monumentos;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class InitData {

    private final MonumentoRepository repository;

    @PostConstruct
    public void init(){


        repository.saveAll(
                Arrays.asList(
                        new Monumento("EG", "Egipto", "El cairo", "29°59′00″N 31°08′00″E", "Gran piramide de giza", "es una piramide muy muy grande", "44.jpg"),
                        new Monumento("EG", "Egipto", "El cairo", "29°59′00″N 31°08′00″E", "Gran piramide de giza", "es una piramide muy muy grande", "44.jpg")
                )
        );

    }
}
