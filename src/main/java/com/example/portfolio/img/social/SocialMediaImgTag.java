package com.example.portfolio.img.social;

import com.example.portfolio.img.ImgTagAttributes;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class SocialMediaImgTag {
//    // Getters and setters (optional)
//    @Getter
//    @Setter
  private String assetUrl;
  private String altName;
  private String onClickAction;

    public static Builder builder() {
    return new Builder();
  }

  // Builder Class
  public static class Builder {
    private String assetUrl;
    private String altName;
    private String onClickAction;

    public Builder assetUrl(String assetUrl) {
      this.assetUrl = assetUrl;
      return this;
    }

    public Builder altName(String altName) {
      this.altName = altName;
      return this;
    }

    public Builder onClickAction(String onClickAction) {
      this.onClickAction = onClickAction;
      return this;
    }

    public SocialMediaImgTag build() {
      SocialMediaImgTag tag = new SocialMediaImgTag();
      tag.assetUrl = this.assetUrl;
      tag.altName = this.altName;
      tag.onClickAction = this.onClickAction;
      return tag;
    }
  }
}
