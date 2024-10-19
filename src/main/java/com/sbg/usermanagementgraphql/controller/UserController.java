package com.sbg.usermanagementgraphql.controller;

import com.sbg.usermanagementgraphql.model.dto.response.UserResponse;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @QueryMapping
    public UserResponse getUserById(@Argument String id) {
        return UserResponse.builder().name("Test").build();
    }
}
