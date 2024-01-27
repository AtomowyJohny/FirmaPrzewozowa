package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.repositories;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.AutobusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutobusRepository extends CrudRepository<AutobusEntity, Long> {
}
