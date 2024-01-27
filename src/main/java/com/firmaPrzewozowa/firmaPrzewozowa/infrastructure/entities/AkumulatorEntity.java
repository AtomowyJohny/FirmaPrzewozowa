package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Akumulator")
@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class AkumulatorEntity {
    @Id
    @Column(name = "ID_Akumulatora", nullable = false)
    private int idAkumulatora;

    @Column(name = "Pojemnosc", nullable = false)
    private int pojemnosc;

    @Column(name = "Znamionowa_Ilosc_Cykli", nullable = false)
    private int znamionowaIloscCykli;

    @Column(name = "Ilosc_Cykli_Rozladowania", nullable = false)
    private int iloscCykliRozladowania;

    @Column(name = "Poziom_Naladowania", nullable = false)
    private int poziomNaladowania;

}