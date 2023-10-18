package ca.tutic.site.models;

import lombok.Data;

@Data
public class Job {
    public Job() {}
    private String url;
    private String employer;
    private String title;
    private String period;
    private String location;
    private String description;
    private String descriptionExtra;
    private String urlLink;
    private String urlText;
}
