package com.example.movie4you.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rating {
    @ManyToOne
    private User user;
    @ManyToOne
    private Movie movie;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ratingID;
    private int rating;
    private Timestamp timestamp;
}
