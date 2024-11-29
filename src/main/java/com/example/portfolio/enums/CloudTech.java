package com.example.portfolio.enums;


import lombok.Getter;

@Getter
public enum CloudTech {
;

    private final String technology;
    private final String experienceLevel;

    CloudTech(String technology, String experienceLevel) {
        this.technology = technology;
        this.experienceLevel = experienceLevel;
    }

}