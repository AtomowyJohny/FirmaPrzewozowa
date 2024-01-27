package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Przystanek_W_Kursie")
public class PrzystanekWKursie {
    @EmbeddedId
    private PrzystanekWKursieId id;

    @MapsId("idPrzystanku")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Przystanku", nullable = false)
    private Przystanek idPrzystanku;

    @MapsId("idKursu")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Kursu", nullable = false)
    private Kurs idKursu;

}