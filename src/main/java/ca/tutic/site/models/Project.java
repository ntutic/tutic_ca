package ca.tutic.site.models;

import lombok.Data;

import java.util.List;

@Data
public class Project {
    public Project() {}
    private String title;
    private String description;
    private String imageDir;
    private String link;
    private String icon;
    private String upwork;
    private List<String> alts;
    private List<String> tools;
}
