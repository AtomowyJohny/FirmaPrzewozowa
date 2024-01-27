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
public class PracownikWZajezdniId implements Serializable {
    private static final long serialVersionUID = -4969651635455776384L;
    @Column(name = "ID_Pracownika", nullable = false)
    private Integer idPracownika;

    @Column(name = "ID_Zajezdni", nullable = false)
    private Integer idZajezdni;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PracownikWZajezdniId entity = (PracownikWZajezdniId) o;
        return Objects.equals(this.idZajezdni, entity.idZajezdni) &&
                Objects.equals(this.idPracownika, entity.idPracownika);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idZajezdni, idPracownika);
    }

}