package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Autobus_Elektryczny")
public class AutobusElektryczny {
    @Id
    @Column(name = "ID_Autobusu_Elektryczny", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Autobusu_Elektryczny", nullable = false)
    private Autobus autobus;

    @Column(name = "Ilosc_Pakietow_Zasilajacych", nullable = false)
    private Integer iloscPakietowZasilajacych;

    @Column(name = "Poziom_Naladowania", nullable = false)
    private Integer poziomNaladowania;

}