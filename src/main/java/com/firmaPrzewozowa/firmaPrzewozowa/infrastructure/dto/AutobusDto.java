package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.dto;

import java.io.Serializable;

public class AutobusDto implements Serializable {
    Integer id;
    Integer przebieg;
    Integer rokProdukcji;
    String model;
    Integer mocNetto;
    Integer zasieg;
    Integer iloscMiejsc;
    Integer iloscPakietowZasilajacych;
    Integer poziomNaladowania;

    public AutobusDto() {
    }
}