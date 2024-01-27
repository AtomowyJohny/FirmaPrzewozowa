package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.services;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.repositories.AutobusRepository;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.AutobusEntity;
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

    public AutobusEntity create(AutobusEntity autobusEntity){
        return autobusRepository.save(autobusEntity);
    }

    public List<AutobusEntity> findAll(){
        List<AutobusEntity> autobusEntityList = new ArrayList<>();
        autobusRepository.findAll().forEach(autobusEntityList::add);
        return autobusEntityList;
    }

    public Optional<AutobusEntity> findById(long id){
        return autobusRepository.findById(id);
    }

    public AutobusEntity update(AutobusEntity autobusEntityToUpdate){
        return autobusRepository.save(autobusEntityToUpdate);
    }

    public void delete(long id){
        autobusRepository.deleteById(id);
    }

}
