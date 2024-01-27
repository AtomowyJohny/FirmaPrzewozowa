package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Autobus")
@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class AutobusEntity {
    @Id
    @Column(name = "ID_Autobus", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Przebieg",nullable = false)
    private Long przebieg;

    @Column(name = "Moc_Netto")
    private Long mocNetto;

    @Column(name = "Zasieg")
    private Long zasieg;

    @Column(name = "Rok_Produkcji")
    private Integer rokProdukcji;

    @Column(name = "Ilosc_Miejsc")
    private Integer iloscMiejsc;

}
