package ca.tutic.site;

import ca.tutic.site.json.StaticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class SiteController {
    private StaticService staticService;

    @Autowired
    public SiteController(StaticService staticService) {
        this.staticService = staticService;
    }

    @GetMapping("/")
    public String getHome(Model model) throws IOException {
        model.addAttribute("projects", staticService.getProjects());
        model.addAttribute("diplomas", staticService.getDiplomas());
        model.addAttribute("jobs", staticService.getJobs());
        model.addAttribute("images", staticService.getImages("scraper_gui"));
        return "index";
    }


}
