package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Autobus {
    @Id
    @Column(name = "ID_Autobusu", nullable = false)
    private Integer id;

    @Column(name = "Przebieg", nullable = false)
    private Integer przebieg;

    @Column(name = "Rok_Produkcji", nullable = false)
    private Integer rokProdukcji;

    @Column(name = "Model", nullable = false, length = 64)
    private String model;

    @Column(name = "Moc_Netto", nullable = false)
    private Integer mocNetto;

    @Column(name = "Zasieg", nullable = false)
    private Integer zasieg;

    @Column(name = "Ilosc_Miejsc", nullable = false)
    private Integer iloscMiejsc;

}