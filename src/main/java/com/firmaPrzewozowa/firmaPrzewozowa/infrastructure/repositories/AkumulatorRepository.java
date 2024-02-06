package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.repositories;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Akumulator;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Autobus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AkumulatorRepository extends JpaRepository<Akumulator, Long> {

        @Query("select aku from Akumulator aku join AkumulatoryAutobusu akuAut on akuAut.idAkumulatora = aku where akuAut.idAutobusuElektryczny.id = :autobusId")
        List<Akumulator> findAkumulatory(@Param("autobusId") int autobusId);
    }

