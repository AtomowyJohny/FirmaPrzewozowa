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
public class MechanikWAutobusieId implements Serializable {
    private static final long serialVersionUID = 3613502416831079659L;
    @Column(name = "ID_Mechanika", nullable = false)
    private Integer idMechanika;

    @Column(name = "ID_Autobusu", nullable = false)
    private Integer idAutobusu;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MechanikWAutobusieId entity = (MechanikWAutobusieId) o;
        return Objects.equals(this.idAutobusu, entity.idAutobusu) &&
                Objects.equals(this.idMechanika, entity.idMechanika);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutobusu, idMechanika);
    }

}