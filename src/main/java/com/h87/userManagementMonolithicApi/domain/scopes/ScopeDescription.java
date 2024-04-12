package com.h87.userManagementMonolithicApi.domain.scopes;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ScopeDescription {
    @Column(name = "c_description")
    private String value;
}
