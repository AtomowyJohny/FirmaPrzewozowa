package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.requests;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.AutobusEntity;

public record CreateAutobusInput(Long id, Long przebieg, Long mocNetto, Long zasieg, Integer rokProdukcji, Integer iloscMiejsc){
    public AutobusEntity ToAutobus(){
        AutobusEntity autobus = new AutobusEntity();

        autobus.setId(id);
        autobus.setPrzebieg(przebieg);
        autobus.setMocNetto(mocNetto);
        autobus.setZasieg(zasieg);
        autobus.setRokProdukcji(rokProdukcji);
        autobus.setIloscMiejsc(iloscMiejsc);

        return autobus;
    }
}
