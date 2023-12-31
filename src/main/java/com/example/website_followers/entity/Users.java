package com.example.website_followers.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "first_name")

    private String first_name;
    @Column(name = "last_name")

    private String last_name;
    @Column(name = "user_name")

    private String user_name;

    @Column(name = "password")

    private String password;

    @Column(name = "activy")

    private Boolean activy;

}
