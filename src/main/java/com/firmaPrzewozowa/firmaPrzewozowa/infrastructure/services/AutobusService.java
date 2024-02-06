package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.services;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Akumulator;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Autobus;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.repositories.AkumulatorRepository;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.repositories.AutobusRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutobusService {
    private final AutobusRepository autobusRepository;

    private final AkumulatorRepository akumulatorRepository;

    public AutobusService(AutobusRepository autobusRepository, AkumulatorRepository akumulatorRepository) {
        this.autobusRepository = autobusRepository;
        this.akumulatorRepository = akumulatorRepository;
    }

    public Autobus create(Autobus Autobus) {
        return autobusRepository.save(Autobus);
    }

    public List<Autobus> findAll() {
        List<Autobus> AutobusList = new ArrayList<>();
        autobusRepository.findAll().forEach(AutobusList::add);
        return AutobusList;
    }

    public List<Akumulator> findAkumulatory(int idAutobusu){return akumulatorRepository.findAkumulatory(idAutobusu);}

    public Optional<Autobus> findById(long id) {
        return autobusRepository.findById(id);
    }

    public Autobus update(Autobus AutobusToUpdate) {
        return autobusRepository.save(AutobusToUpdate);
    }

    public void delete(long id) {
        autobusRepository.deleteById(id);
    }

}
