package com.example.movie4you.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieID;
    private String title;
    @Enumerated(EnumType.STRING)
    private Genre  genre;

    private String image;
    @OneToMany
    private List<Rating> ratings = new ArrayList<>();


}
