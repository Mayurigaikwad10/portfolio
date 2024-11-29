package com.example.portfolio.enums;

import lombok.Getter;

@Getter
public enum BackendTech {
    SPRING_BOOT("Spring Boot", "Advanced"),
    JAVA("Java", "Intermediate"),
    MYSQL("MySQL", "Advanced"),
    HIBERNATE("Hibernate", "Intermediate"),
    SERVLET_JSP("Servlet-Jsp", "Intermediate");

    private final String technology;
    private final String experienceLevel;

    BackendTech(String technology, String experienceLevel) {
        this.technology = technology;
        this.experienceLevel = experienceLevel;
    }
}
