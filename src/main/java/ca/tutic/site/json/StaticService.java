package ca.tutic.site.json;

import ca.tutic.site.models.Diploma;
import ca.tutic.site.models.Project;
import ca.tutic.site.models.Job;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Service
public class StaticService {
    private ObjectMapper objectMapper;

    public StaticService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<Project> getProjects() throws IOException {
        try(InputStream is = new ClassPathResource("static/data/projects.json").getInputStream()) {
            return objectMapper.readValue(is, new TypeReference<List<Project>>() {
            });
        }
    }

    public List<Diploma> getDiplomas() throws IOException {
        try(InputStream is = new ClassPathResource("static/data/diplomas.json").getInputStream()) {
            return objectMapper.readValue(is, new TypeReference<List<Diploma>>() {
            });
        }
    }

    public List<Job> getJobs() throws IOException {
        try(InputStream is = new ClassPathResource("static/data/jobs.json").getInputStream()) {
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
