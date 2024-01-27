package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.services;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Autobus;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.repositories.AutobusRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutobusService {
    private final AutobusRepository autobusRepository;

    public AutobusService(AutobusRepository autobusRepository) {
        this.autobusRepository = autobusRepository;
    }

    public Autobus create(Autobus Autobus) {
        return autobusRepository.save(Autobus);
    }

    public List<Autobus> findAll() {
        List<Autobus> AutobusList = new ArrayList<>();
        autobusRepository.findAll().forEach(AutobusList::add);
        return AutobusList;
    }

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
