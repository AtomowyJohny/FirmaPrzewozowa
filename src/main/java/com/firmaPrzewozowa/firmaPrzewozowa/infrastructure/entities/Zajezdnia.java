package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Zajezdnia {
    @Id
    @Column(name = "ID_Zajezdni", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Zajezdni", nullable = false)
    private Przystanek przystanek;

    @Column(name = "Rodzaj_Zajezdni", nullable = false, length = 16)
    private String rodzajZajezdni;

}