package ca.tutic.site.models;

import lombok.Data;

@Data
public class Job {
    private String employer;
    private String title;
    private String period;
    private String description;
    private String descriptionExtra;
    private String urlLink;
    private String urlText;
}
