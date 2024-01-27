package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AkumulatoryAutobusu {
    @EmbeddedId
    private AkumulatoryAutobusuId id;

    @MapsId("idAutobusuElektryczny")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Autobusu_Elektryczny", nullable = false)
    private AutobusElektryczny idAutobusuElektryczny;

    @MapsId("idAkumulatora")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Akumulatora", nullable = false)
    private Akumulator idAkumulatora;

}