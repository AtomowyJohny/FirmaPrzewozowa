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
public class AutobusWMiescieId implements Serializable {
    private static final long serialVersionUID = -4711859601380186673L;
    @Column(name = "ID_Autobusu_Miedzymiastowy", nullable = false)
    private Integer idAutobusuMiedzymiastowy;

    @Column(name = "ID_Miasta", nullable = false)
    private Integer idMiasta;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AutobusWMiescieId entity = (AutobusWMiescieId) o;
        return Objects.equals(this.idAutobusuMiedzymiastowy, entity.idAutobusuMiedzymiastowy) &&
                Objects.equals(this.idMiasta, entity.idMiasta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutobusuMiedzymiastowy, idMiasta);
    }

}