package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.repositories;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Autobus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface AutobusRepository extends JpaRepository<Autobus, Long> {

    @Query("select autobus from Autobus autobus join MechanikWAutobusie mwa on autobus.id = mwa.autobus.id where mwa.mechanik.id = :mechanikId")
    List<Autobus> findAutobusByMechanikId(@Param("mechanikId") long mechanikId);
}
