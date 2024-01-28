package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.repositories;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.MechanikWAutobusie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutobusyMechanikaRepository extends CrudRepository<MechanikWAutobusie, Long> {
}
