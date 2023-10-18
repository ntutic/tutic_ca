package ca.tutic.site.models;

import lombok.Data;

@Data
public class Diploma {
    private String url;
    private String school;
    private String diploma;
    private String period;
    private String location;
    public Diploma() {}
}
