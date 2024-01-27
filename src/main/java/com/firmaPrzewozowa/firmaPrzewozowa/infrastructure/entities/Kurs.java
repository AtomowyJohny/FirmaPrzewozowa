package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Kurs")
public class Kurs {
    @Id
    @Column(name = "ID_Kursu", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Autobusu", nullable = false)
    private Autobus idAutobusu;

    @Column(name = "Nazwa_Kursu", nullable = false, length = 32)
    private String nazwaKursu;

    @Column(name = "Dlugosc_Trasy", nullable = false)
    private Integer dlugoscTrasy;

}