package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "mechanik")
public class Mechanik extends Pracownik {
    @Id
    @Column(name = "ID_Mechanika", nullable = false)
    private Integer id;

//    @MapsId
//    @OneToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "ID_Mechanika", nullable = false)
//    private Pracownik pracownik;

    @Column(name = "Stopien_Doswiadczenia", nullable = false)
    private Integer stopienDoswiadczenia;

    @Column(name = "Dodatek_Do_Premii_Za_Doswiadczenie", nullable = false)
    private Integer dodatekDoPremiiZaDoswiadczenie;

    @Column(name = "Premia", nullable = false)
    private Integer premia;

}