package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.services;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Mechanik;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.MechanikWAutobusie;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.repositories.AutobusyMechanikaRepository;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.repositories.MechanikRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MechanikService {
    private final MechanikRepository mechanikRepository;

    private final AutobusyMechanikaRepository autobusyMechanikaRepository;

    public MechanikService(MechanikRepository mechanikRepository, AutobusyMechanikaRepository autobusyMechanikaRepository) {
        this.mechanikRepository = mechanikRepository;
        this.autobusyMechanikaRepository = autobusyMechanikaRepository;
    }

    public List<Mechanik> findAllMechanics(){
        List<Mechanik> mechanikList = new ArrayList<>();
        mechanikRepository.findAll().forEach(mechanikList::add);
        return mechanikList;
    }
    public Optional<Mechanik> findById(long id){ return mechanikRepository.findById(id);}

//    public Optional<MechanikWAutobusie> findAutobusyMechanika(long idMechanik) {
//        return autobusyMechanikaRepository.findById(idMechanik);
//    }

}
