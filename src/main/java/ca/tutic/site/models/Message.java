package ca.tutic.site.models;

import lombok.Data;

@Data
public class Message {
    private String name;
    private String email;
    private String phone;
    private String content;
}
