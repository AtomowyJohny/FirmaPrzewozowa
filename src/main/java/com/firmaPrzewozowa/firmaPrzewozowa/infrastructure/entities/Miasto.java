package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Miasto {
    @Id
    @Column(name = "ID_Miasta", nullable = false)
    private Integer id;

    @Column(name = "Nazwa", nullable = false, length = 256)
    private String nazwa;

}