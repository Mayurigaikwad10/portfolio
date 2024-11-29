package com.example.portfolio.controller;

import com.example.portfolio.enums.*;

import com.example.portfolio.experience.TechExperience;
import com.example.portfolio.img.arrow.ArrowImgTag;
import com.example.portfolio.img.project.ProjectImgTag;
import com.example.portfolio.img.social.SocialMediaImgTag;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.portfolio.utils.Constants.*;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String portfolio(Model model) {
        model.addAttribute("myName", MY_NAME);
        model.addAttribute("myEmail", MY_EMAIL_ID);
        model.addAttribute("titles", getTitles());
        model.addAttribute("social", getSocialMediaImgTagAttributes());
        model.addAttribute("projects", getProjectImgTagAttributes());
        model.addAttribute("profilepic", PROFILE_PIC_ASSET_URL);
        model.addAttribute("aboutpic", ABOUT_PIC_ASSET_URL);
        model.addAttribute("education", EDUCATION_ASSET_URL);
        model.addAttribute("arrow", getArrowImgTagAttributes());
        model.addAttribute("frontend", getFrontendDevelopmentExperience());
        model.addAttribute("backend", getBackendDevelopmentExperience());
        model.addAttribute("database", getDatabaseExperience());
        model.addAttribute("checkmark", CHECKMARK_ASSET_URL);
        model.addAttribute("linkedin", LINKEDIN_URL);
        model.addAttribute("mailtoemail", MAIL_TO_EMAIL);
        model.addAttribute("email", EMAIL_ASSET_URL);
        model.addAttribute("linkedinpic", LINKEDIN_ASSET_URL);
        model.addAttribute("certifications", getCertifications());

        return "index";
    }

    private static List<ProjectImgTag> getProjectImgTagAttributes() {
        List<ProjectImgTag> imgTagList = new ArrayList<>();

        imgTagList.add(ProjectImgTag.builder().assetUrl(SPACE_AURA_URL).altName(SPACE_AURA)
                .projectName(SPACE_AURA).onGithubClickAction("https://github.com/Mayurigaikwad10/Web-Designing-Project")
                .build());

        imgTagList.add(ProjectImgTag.builder().assetUrl(PORTFOLIO_URL).altName(PORTFOLIO)
                .projectName(PORTFOLIO).onGithubClickAction("https://github.com/Mayurigaikwad10/portfolio")
                .build());

        return imgTagList;
    }

    private static List<TechExperience> getFrontendDevelopmentExperience() {
        List<TechExperience> imgTagList = new ArrayList<>();

        Arrays.stream(FrontendTech.values()).forEach(tech -> {
            imgTagList.add(TechExperience.builder().technology(tech.getTechnology()).expLevel(tech.getExperienceLevel())
                    .build());
        });

        return imgTagList;
    }

    private static List<TechExperience> getBackendDevelopmentExperience() {
        List<TechExperience> imgTagList = new ArrayList<>();

        Arrays.stream(BackendTech.values()).forEach(tech -> {
            imgTagList.add(TechExperience.builder().technology(tech.getTechnology()).expLevel(tech.getExperienceLevel())
                    .build());
        });

        return imgTagList;
    }


    private static List<TechExperience> getDatabaseExperience() {
        List<TechExperience> imgTagList = new ArrayList<>();

        Arrays.stream(DatabaseTech.values()).forEach(tech -> {
            imgTagList.add(TechExperience.builder().technology(tech.getTechnology()).expLevel(tech.getExperienceLevel())
                    .build());
        });

        return imgTagList;
    }

    @GetMapping(path = "/download")
    public ResponseEntity<Resource> downloadResume() throws IOException {
        File file = new File(RESUME_FILE_PATH);
        Path path = Paths.get(file.getAbsolutePath());
        ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + RESUME_FILENAME + "\"")
                .contentLength(file.length()).contentType(MediaType.parseMediaType(RESUME_MEDIA_TYPE)).body(resource);
    }

    private static List<String> getTitles() {
        List<String> listOfTitles = new ArrayList<>();

        Arrays.stream(Titles.values()).forEach(title -> {
            listOfTitles.add(title.getValue());
        });

        return listOfTitles;
    }

    private static List<SocialMediaImgTag> getSocialMediaImgTagAttributes() {
        List<SocialMediaImgTag> imgTagList = new ArrayList<>();

        imgTagList.add(SocialMediaImgTag.builder().assetUrl(LINKEDIN_ASSET_URL).altName("My LinkedIn profile")
                .onClickAction(LINKEDIN_URL).build());
        imgTagList.add(SocialMediaImgTag.builder().assetUrl(GITHUB_ASSET_URL).altName("My Github profile")
                .onClickAction(GITHUB_URL).build());

 
        return imgTagList;
    }

  

    private static Object getArrowImgTagAttributes() {
        return ArrowImgTag.builder().assetUrl(ARROW_ASSET_URL).altName("Arrow icon").build();
    }

    private static List<TechExperience> getCertifications() {
        List<TechExperience> certificationList = new ArrayList<>();

        certificationList.add(
                TechExperience.builder()
                        .technology("Certified Full Stack Java Developer")
                        .expLevel("/assets/certified.png") // Sticker for this certification
                        .build()
        );

        certificationList.add(
                TechExperience.builder()
                        .technology("Graphic Designer")
                        .expLevel("/assets/certified.png") // Sticker for this certification
                        .build()
        );

        return certificationList;
    }


}



