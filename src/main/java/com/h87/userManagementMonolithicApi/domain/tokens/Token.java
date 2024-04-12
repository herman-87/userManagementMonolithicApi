package com.h87.userManagementMonolithicApi.domain.tokens;

import com.h87.userManagementMonolithicApi.domain.commons.EntityBase;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_token")
@Entity
public class Token extends EntityBase {
    @Embedded
    private TokenValue value;
}
