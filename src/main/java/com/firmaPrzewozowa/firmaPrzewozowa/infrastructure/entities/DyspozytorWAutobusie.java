package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Dyspozytor_W_Autobusie")
public class DyspozytorWAutobusie {
    @EmbeddedId
    private DyspozytorWAutobusieId id;

    @MapsId("idDyspozytora")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Dyspozytora", nullable = false)
    private Dyspozytor idDyspozytora;

    @MapsId("idAutobusu")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Autobusu", nullable = false)
    private Autobus idAutobusu;

}