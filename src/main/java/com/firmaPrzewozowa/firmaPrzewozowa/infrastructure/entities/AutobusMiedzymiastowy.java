package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Autobus_Miedzymiastowy")
public class AutobusMiedzymiastowy {
    @Id
    @Column(name = "ID_Autobusu_Miedzymiastowy", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Autobusu_Miedzymiastowy", nullable = false)
    private Autobus autobus;

    @Column(name = "Ilosc_Miast", nullable = false)
    private Integer iloscMiast;

    @Column(name = "Max_Odlegosc_Od_zajezdni", nullable = false)
    private Integer maxOdlegoscOdZajezdni;

    @Column(name = "Czy_Poza_Kraj", nullable = false)
    private Boolean czyPozaKraj = false;

}