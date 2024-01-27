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
public class PrzystanekWKursieId implements Serializable {
    private static final long serialVersionUID = 1458519254924923160L;
    @Column(name = "ID_Przystanku", nullable = false)
    private Integer idPrzystanku;

    @Column(name = "ID_Kursu", nullable = false)
    private Integer idKursu;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PrzystanekWKursieId entity = (PrzystanekWKursieId) o;
        return Objects.equals(this.idKursu, entity.idKursu) &&
                Objects.equals(this.idPrzystanku, entity.idPrzystanku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKursu, idPrzystanku);
    }

}