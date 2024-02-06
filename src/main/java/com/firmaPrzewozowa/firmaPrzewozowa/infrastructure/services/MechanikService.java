package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.services;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Autobus;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Mechanik;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.MechanikWAutobusie;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.repositories.AutobusRepository;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.repositories.AutobusyMechanikaRepository;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.repositories.MechanikRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MechanikService {
    private final MechanikRepository mechanikRepository;

    private final AutobusService autobusService;

    private final AutobusyMechanikaRepository autobusyMechanikaRepository;
    private AutobusRepository autobusRepository;

    public MechanikService(MechanikRepository mechanikRepository, AutobusService autobusService, AutobusyMechanikaRepository autobusyMechanikaRepository, AutobusRepository autobusRepository) {
        this.mechanikRepository = mechanikRepository;
        this.autobusService = autobusService;
        this.autobusyMechanikaRepository = autobusyMechanikaRepository;
        this.autobusRepository = autobusRepository;
    }

    public List<Mechanik> findAllMechanics(){
        List<Mechanik> mechanikList = new ArrayList<>();
        mechanikRepository.findAll().forEach(mechanikList::add);
        return mechanikList;
    }
    public Optional<Mechanik> findById(long id){ return mechanikRepository.findById(id);}


    public List<Autobus>findAutobusyMechanika(long id){
        return autobusRepository.findAutobusByMechanikId(id);
    }
}
