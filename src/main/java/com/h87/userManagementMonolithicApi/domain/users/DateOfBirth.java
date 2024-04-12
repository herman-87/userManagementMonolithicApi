package com.h87.userManagementMonolithicApi.domain.users;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.time.LocalDate;

@Embeddable
public class DateOfBirth {
    @Column(name = "c_date_of_birth")
    private LocalDate value;
}
