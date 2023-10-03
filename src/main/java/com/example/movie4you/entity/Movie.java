package com.example.movie4you.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieID;
    private String title;
    @Enumerated(EnumType.STRING)
    private Genre  genre;

    private String image;

    public Movie() {
    }
}
