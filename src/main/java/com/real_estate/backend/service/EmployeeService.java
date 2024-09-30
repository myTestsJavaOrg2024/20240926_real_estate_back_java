package com.real_estate.backend.service;


import com.real_estate.backend.entity.EmployeeEntity;
import com.real_estate.backend.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
//    todo - 6: hotkey который показывает проблему
//    todo - 11: нужен ли интерфейс для сервиса и репозитория

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void createEmployee(String firstName, String lastName) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setFirstName(firstName);
        employeeEntity.setLastName(lastName);
        employeeRepository.save(employeeEntity);
//    todo 13: возвращаемые статус коды
//    todo 14: единая место обработки ошибок, как его организовать архитектурно правильно
    }

    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity getEmployeeById(long id) {
        return employeeRepository.findById(id).orElse(null);
//        todo 15: как принято называть круд методы
    }
}
