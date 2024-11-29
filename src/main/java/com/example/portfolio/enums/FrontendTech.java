package com.example.portfolio.enums;

import lombok.Getter;

@Getter
public enum FrontendTech {
  HTML("HTML", "Advanced"),
  CSS("CSS", "Advanced"),
  JAVASCRIPT("JavaScript", "Intermediate"),
  REACT("React", "Intermediate"),
  ANGULAR("Angular", "Beginner");

  private final String technology;
  private final String experienceLevel;

  FrontendTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }
}
