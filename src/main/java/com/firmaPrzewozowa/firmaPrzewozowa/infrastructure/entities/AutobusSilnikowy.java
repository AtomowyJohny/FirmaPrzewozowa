package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Autobus_Silnikowy")
public class AutobusSilnikowy extends Autobus {



    @Column(name = "Ilosc_Koni", nullable = false)
    private Integer iloscKoni;

    @Column(name = "Spalanie", nullable = false)
    private Integer spalanie;

    @Column(name = "Pojemnosc_Zbiornika", nullable = false)
    private Integer pojemnoscZbiornika;

    @Column(name = "Typ_Paliwa", nullable = false, length = 32)
    private String typPaliwa;

    @Column(name = "Ilosc_Paliwa", nullable = false)
    private Integer iloscPaliwa;

}