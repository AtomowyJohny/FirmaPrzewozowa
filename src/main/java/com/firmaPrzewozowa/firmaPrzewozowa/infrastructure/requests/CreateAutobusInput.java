package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.requests;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Autobus;

public record CreateAutobusInput(Integer id, Integer przebieg, Integer mocNetto, Integer zasieg, Integer rokProdukcji,
                                 Integer iloscMiejsc) {
    public Autobus ToAutobus() {
        Autobus autobus = new Autobus();

        autobus.setId(id);
        autobus.setPrzebieg(przebieg);
        autobus.setMocNetto(mocNetto);
        autobus.setZasieg(zasieg);
        autobus.setRokProdukcji(rokProdukcji);
        autobus.setIloscMiejsc(iloscMiejsc);

        return autobus;
    }
}
