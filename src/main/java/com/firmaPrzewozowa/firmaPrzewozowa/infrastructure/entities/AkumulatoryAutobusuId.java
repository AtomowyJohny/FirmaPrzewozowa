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
public class AkumulatoryAutobusuId implements Serializable {
    private static final long serialVersionUID = -4063158510719258359L;
    @Column(name = "ID_Autobusu_Elektryczny", nullable = false)
    private Integer idAutobusuElektryczny;

    @Column(name = "ID_Akumulatora", nullable = false)
    private Integer idAkumulatora;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AkumulatoryAutobusuId entity = (AkumulatoryAutobusuId) o;
        return Objects.equals(this.idAutobusuElektryczny, entity.idAutobusuElektryczny) &&
                Objects.equals(this.idAkumulatora, entity.idAkumulatora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutobusuElektryczny, idAkumulatora);
    }

}