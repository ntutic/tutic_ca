package ca.tutic.site;

import ca.tutic.site.services.EmailService;
import ca.tutic.site.services.StaticService;
import ca.tutic.site.models.Message;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.io.IOException;

@Controller
public class SiteController {
    private StaticService staticService;
    private EmailService emailService;
    private LocaleResolver localeResolver;

    @Autowired
    public SiteController(StaticService staticService, EmailService emailService, LocaleResolver localeResolver) {
        this.staticService = staticService;
        this.emailService = emailService;
        this.localeResolver = localeResolver;
    }

    @GetMapping("/")
    public String getHome(@ModelAttribute("highlight") String highlight, Model model) throws IOException {
        model.addAttribute("projects", staticService.getProjects());
        model.addAttribute("diplomas", staticService.getDiplomas());
        model.addAttribute("jobs", staticService.getJobs());
        model.addAttribute("message", new Message());
        model.addAttribute("highlight", highlight);
        return "index";
    }

    @PostMapping("/highlight")
    public String getHighlight(@RequestParam("name") String name, RedirectAttributes redirectAttributes) throws IOException {
        redirectAttributes.addFlashAttribute("highlight", name);
        return "redirect:/";
    }

    @PostMapping("/contact")
    @ResponseBody
    public String sendMessage(@ModelAttribute("message") Message message) {
        System.out.println(message);
        return emailService.sendEmail(message);
    }

    @RequestMapping("/{lang}")
    public String changeLocale(@PathVariable("lang") String lang,
                               HttpServletRequest request,
                               HttpServletResponse response) {
        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
        if (localeResolver != null) {
            localeResolver.setLocale(request, response, StringUtils.parseLocaleString(lang));
        }
        return "redirect:/";
    }

    @GetMapping("/upwork")
    public String toUpwork(){
        return "redirect:https://www.upwork.com/freelancers/~01d06d647eb569a541";
    }

}
