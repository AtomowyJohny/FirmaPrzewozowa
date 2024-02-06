package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Autobus_Hybrydowy")
public class AutobusHybrydowy extends Autobus{

    @OneToOne
    @JoinColumn(name = "ID_Autobusu", nullable = false, insertable = false, updatable = false)
    private AutobusElektryczny autobusElektryczny;

    @OneToOne
    @JoinColumn(name = "ID_Autobusu", nullable = false, insertable = false, updatable = false)
    private AutobusSilnikowy autobusSilnikowy;
//    @EmbeddedId
//    private AutobusHybrydowyId id;
//
//    @MapsId("idAutobusuElektryczny")
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "ID_Autobusu_Elektryczny", nullable = false)
//    private AutobusElektryczny idAutobusuElektryczny;
//
//    @MapsId("idAutobusuSilnikowy")
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "ID_Autobusu_Silnikowy", nullable = false)
//    private AutobusSilnikowy idAutobusuSilnikowy;

    @Column(name = "Typ_Napedu_Hybrydowego", nullable = false, length = 10)
    private String typNapeduHybrydowego;

    @Column(name = "Ladowanie_Plug_in", nullable = false)
    private Boolean ladowaniePlugIn = false;

}