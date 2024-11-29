package com.example.portfolio.img.project;

import com.example.portfolio.img.ImgTagAttributes;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder(toBuilder = true)
public class ProjectImgTag extends ImgTagAttributes {

  private String projectName;
  private String onGithubClickAction;
}