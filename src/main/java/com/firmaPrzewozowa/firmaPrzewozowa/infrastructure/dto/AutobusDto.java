package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.dto;

public record AutobusDto(
        Integer id,
        Integer przebieg,
        Integer rokProdukcji,
        String model,
        Integer mocNetto,
        Integer iloscMiejsc,
        Integer iloscPakietowZasilajacych,
        Integer poziomNaladowania
){ }