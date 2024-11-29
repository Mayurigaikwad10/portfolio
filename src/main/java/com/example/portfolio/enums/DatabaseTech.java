package com.example.portfolio.enums;

import lombok.Getter;

@Getter
public enum DatabaseTech {
    MYSQL("MySQL", "Advanced"),
    POSTGRESQL("PostgreSQL", "Intermediate"),
    MONGODB("H2", "Advanced");


    private final String technology;
    private final String experienceLevel;

    DatabaseTech(String technology, String experienceLevel) {
        this.technology = technology;
        this.experienceLevel = experienceLevel;
    }
}
