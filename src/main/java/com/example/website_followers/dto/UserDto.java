package com.example.website_followers.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private int user_id;

    private String first_name;

    private String last_name;

    private String user_name;

    private String password;

    private Boolean activy;
}
