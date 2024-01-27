package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Autobus_Silnikowy")
public class AutobusSilnikowy {
    @Id
    @Column(name = "ID_Autobusu_Silnikowy", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Autobusu_Silnikowy", nullable = false)
    private Autobus autobus;

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