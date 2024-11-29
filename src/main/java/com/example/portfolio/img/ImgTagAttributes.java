package com.example.portfolio.img;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
public class ImgTagAttributes {
  private String assetUrl;
  private String altName;
}