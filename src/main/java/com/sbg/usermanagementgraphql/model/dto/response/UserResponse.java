package com.sbg.usermanagementgraphql.model.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
    private String name;
}
