package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.services;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Autobus;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Mechanik;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.repositories.MechanikRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MechanikService {
    private final MechanikRepository mechanikRepository;

    public MechanikService(MechanikRepository mechanikRepository) {
        this.mechanikRepository = mechanikRepository;
    }

    public List<Mechanik> findAll(){
        List<Mechanik> mechanikList = new ArrayList<>();
        mechanikRepository.findAll().forEach(mechanikList::add);
        return mechanikList;
    }
    public Optional<Mechanik> findById(long id){ return mechanikRepository.findById(id);}

}
