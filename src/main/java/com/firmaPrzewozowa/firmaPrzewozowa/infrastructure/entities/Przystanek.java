package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Przystanek {
    @Id
    @Column(name = "ID_Przystanku", nullable = false)
    private Integer id;

    @Column(name = "Nazwa", nullable = false, length = 64)
    private String nazwa;

    @Column(name = "Numer", nullable = false)
    private Integer numer;

    @Column(name = "Adres", nullable = false, length = 128)
    private String adres;

}