package ca.tutic.site.configs;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Configuration;

@Configuration
@PropertySource(value = "classpath:secrets.properties")
public class SecretsConfig {
}