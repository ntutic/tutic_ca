package ca.tutic.site.services;

import ca.tutic.site.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public String sendEmail(Message message) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setSubject(String.format("Email from %s", message.getName()));
        email.setTo("nikolatutic1@gmail.com");
        email.setText(String.format("""
            Name: %s
            Phone: %s
            Email: %s
            Content: %s""",
                message.getName(),
                message.getPhone(),
                message.getEmail(),
                message.getContent()
        ));
        try {
            emailSender.send(email);
        } catch (Exception e) {
            return "An error occured, try again or message me directly at contact@tutic.ca.";
        }
        return "Message sent!";
    }
}
