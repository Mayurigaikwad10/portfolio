package com.example.portfolio.img.project;

import com.example.portfolio.img.ImgTagAttributes;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
public class ProjectImgTag extends ImgTagAttributes {

  private String projectName;
  private String onGithubClickAction;
  private String onLiveDemoClickAction;
}