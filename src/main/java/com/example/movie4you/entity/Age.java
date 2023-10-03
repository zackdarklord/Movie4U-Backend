package com.example.movie4you.entity;

public enum Age {
    AGE_1(1),
    AGE_18(18),
    AGE_25(25),
    AGE_35(35),
    AGE_45(45),
    AGE_50(50),
    AGE_56(56);

    private final int ageValue;

    Age(int ageValue) {
        this.ageValue = ageValue;
    }

    public int getAgeValue() {
        return ageValue;
    }}
