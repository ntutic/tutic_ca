package ca.tutic.site;

import ca.tutic.site.json.JsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class SiteController {
    private JsonService jsonService;

    @Autowired
    public SiteController(JsonService jsonService) {
        this.jsonService = jsonService;
    }

    @GetMapping("/")
    public String getHome(Model model) throws IOException {
        model.addAttribute("projects", jsonService.getProjects());
        model.addAttribute("diplomas", jsonService.getDiplomas());
        model.addAttribute("jobs", jsonService.getJobs());
        return "index";
    }
}
