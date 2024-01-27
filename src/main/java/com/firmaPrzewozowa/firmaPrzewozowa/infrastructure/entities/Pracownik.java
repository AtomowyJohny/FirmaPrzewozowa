package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Pracownik {
    @Id
    @Column(name = "ID_Pracownika", nullable = false)
    private Integer id;

    @Column(name = "Imie", nullable = false, length = 32)
    private String imie;

    @Column(name = "Nazwisko", nullable = false, length = 64)
    private String nazwisko;

    @Column(name = "PESEL", nullable = false)
    private Long pesel;

    @Column(name = "Wiek", nullable = false)
    private Integer wiek;

    @Column(name = "Data_Urodzenia", nullable = false)
    private LocalDate dataUrodzenia;

    @Column(name = "Dodatek_Od_Lat_Pracy", nullable = false)
    private Integer dodatekOdLatPracy;

    @Column(name = "Numer_Telefonu")
    private Integer numerTelefonu;

    @Column(name = "Data_Zatrudnienia", nullable = false)
    private LocalDate dataZatrudnienia;

    @Column(name = "Mnoznik_Wyplaty", nullable = false)
    private Double mnoznikWyplaty;

    @Column(name = "Stawka_Bazowa", nullable = false)
    private Integer stawkaBazowa;

}