package com.example.movie4you.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.ORDINAL)
    private Occupation occupation;
    @Enumerated(EnumType.ORDINAL)
    private Age age;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String photo;
    @Column(unique = true)
    private String email;
    private String password;
    private String username;
}
