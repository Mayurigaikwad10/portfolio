package com.example.portfolio.enums;

import lombok.Getter;

@Getter
public enum Titles {
  Full_Stack_Java_Developer("Full Stack Java Developer");

  private final String value;

  Titles(String value) {
    this.value = value;
  }

}