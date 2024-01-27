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
public class DyspozytorWAutobusieId implements Serializable {
    private static final long serialVersionUID = 9001064881914277443L;
    @Column(name = "ID_Dyspozytora", nullable = false)
    private Integer idDyspozytora;

    @Column(name = "ID_Autobusu", nullable = false)
    private Integer idAutobusu;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DyspozytorWAutobusieId entity = (DyspozytorWAutobusieId) o;
        return Objects.equals(this.idAutobusu, entity.idAutobusu) &&
                Objects.equals(this.idDyspozytora, entity.idDyspozytora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutobusu, idDyspozytora);
    }

}