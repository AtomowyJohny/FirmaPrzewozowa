package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class AutobusHybrydowyId implements Serializable {
    private static final long serialVersionUID = -2794439980055164095L;
    @Column(name = "ID_Autobusu_Elektryczny", nullable = false)
    private Integer idAutobusuElektryczny;

    @Column(name = "ID_Autobusu_Silnikowy", nullable = false)
    private Integer idAutobusuSilnikowy;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AutobusHybrydowyId entity = (AutobusHybrydowyId) o;
        return Objects.equals(this.idAutobusuElektryczny, entity.idAutobusuElektryczny) &&
                Objects.equals(this.idAutobusuSilnikowy, entity.idAutobusuSilnikowy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutobusuElektryczny, idAutobusuSilnikowy);
    }

}