package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Akumulator {
    @Id
    @Column(name = "ID_Akumulatora", nullable = false)
    private Integer id;

    @Column(name = "Pojemnosc", nullable = false)
    private Integer pojemnosc;

    @Column(name = "Znamionowa_Ilosc_Cykli", nullable = false)
    private Integer znamionowaIloscCykli;

    @Column(name = "Ilosc_Cykli_Rozladowania", nullable = false)
    private Integer iloscCykliRozladowania;

    @Min(0)
    @Max(100)
    @Column(name = "Poziom_Naladowania", nullable = false)
    private Integer poziomNaladowania;

}