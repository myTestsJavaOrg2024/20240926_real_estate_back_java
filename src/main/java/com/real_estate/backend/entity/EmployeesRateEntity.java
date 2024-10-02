package com.real_estate.backend.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "employees_rate")
public class EmployeesRateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employees_type_rate_id")
    private EmployeesRateTypeEntity typeId;

    private Float value;

    @ManyToOne
    @JoinColumn(name = "currency_id")
    private CurrencyTypeEntity currencyTypeId;

    private Date date;
//    todo : блокировки к этой таблице. удобно или не удобно

}
