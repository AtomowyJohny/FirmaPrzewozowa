package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Mechanik_W_Autobusie")
public class MechanikWAutobusie {
    @EmbeddedId
    private MechanikWAutobusieId id;

    @MapsId("idMechanika")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Mechanika", nullable = false)
    private Mechanik idMechanika;

    @MapsId("idAutobusu")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Autobusu", nullable = false)
    private Autobus idAutobusu;

}