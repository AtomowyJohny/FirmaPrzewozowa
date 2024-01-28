package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.repositories;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Mechanik;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanikRepository extends CrudRepository<Mechanik, Long> {
}
