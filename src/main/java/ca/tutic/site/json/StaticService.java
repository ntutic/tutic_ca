package ca.tutic.site.json;

import ca.tutic.site.models.Diploma;
import ca.tutic.site.models.Project;
import ca.tutic.site.models.Job;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.LocaleResolver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Service
public class StaticService {
    private LocaleResolver localeResolver;
    private ObjectMapper objectMapper;

    public StaticService(ObjectMapper objectMapper, LocaleResolver localeResolver) {
        this.objectMapper = objectMapper;
        this.localeResolver = localeResolver;
    }

    public String localizeFilePath(String fileName) {
        String lang = LocaleContextHolder.getLocale().getLanguage();
        if (lang != "en") {
            return fileName + "_" + lang;
        } else {
            return fileName;
        }
    }

    public List<Project> getProjects() throws IOException {
        String fileName = localizeFilePath("projects");
        try(InputStream is = new ClassPathResource("static/data/" + fileName + ".json").getInputStream()) {
            return objectMapper.readValue(is, new TypeReference<List<Project>>() {
            });
        }
    }

    public List<Diploma> getDiplomas() throws IOException {
        String fileName = localizeFilePath("diplomas");
        try(InputStream is = new ClassPathResource("static/data/" + fileName + ".json").getInputStream()) {
            return objectMapper.readValue(is, new TypeReference<List<Diploma>>() {
            });
        }
    }

    public List<Job> getJobs() throws IOException {
        String fileName = localizeFilePath("jobs");
        try(InputStream is = new ClassPathResource("static/data/" + fileName + ".json").getInputStream()) {
            return objectMapper.readValue(is, new TypeReference<List<Job>>() {
            });
        }
    }

    public List<String> getImages(String dir) throws IOException {
        File folder = new ClassPathResource("static/img/" + dir).getFile();
        String[] files = folder.list();
        List<String> images = Arrays.asList(files);
        return images;
    }
}
