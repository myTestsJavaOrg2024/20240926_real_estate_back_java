package com.real_estate.backend.repository;

import com.real_estate.backend.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
//  todo - 5: кодстайл форматеры линтеры и т д.
}