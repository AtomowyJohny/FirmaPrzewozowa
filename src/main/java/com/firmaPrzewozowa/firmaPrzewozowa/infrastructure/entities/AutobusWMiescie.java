package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Autobus_W_Miescie")
public class AutobusWMiescie {
    @EmbeddedId
    private AutobusWMiescieId id;

    @MapsId("idAutobusuMiedzymiastowy")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Autobusu_Miedzymiastowy", nullable = false)
    private AutobusMiedzymiastowy idAutobusuMiedzymiastowy;

    @MapsId("idMiasta")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Miasta", nullable = false)
    private Miasto idMiasta;

}