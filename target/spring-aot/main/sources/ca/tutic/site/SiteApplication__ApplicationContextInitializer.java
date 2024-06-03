package ca.tutic.site;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.Override;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.ContextAnnotationAutowireCandidateResolver;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PropertySourceDescriptor;
import org.springframework.core.io.support.PropertySourceProcessor;

/**
 * {@link ApplicationContextInitializer} to restore an application context based on previous AOT processing.
 */
public class SiteApplication__ApplicationContextInitializer implements ApplicationContextInitializer<GenericApplicationContext> {
  @Override
  public void initialize(GenericApplicationContext applicationContext) {
    DefaultListableBeanFactory beanFactory = applicationContext.getDefaultListableBeanFactory();
    beanFactory.setAutowireCandidateResolver(new ContextAnnotationAutowireCandidateResolver());
    beanFactory.setDependencyComparator(AnnotationAwareOrderComparator.INSTANCE);
    processPropertySources(applicationContext.getEnvironment(), applicationContext);
    new SiteApplication__BeanFactoryRegistrations().registerBeanDefinitions(beanFactory);
    new SiteApplication__BeanFactoryRegistrations().registerAliases(beanFactory);
  }

  /**
   * Apply known @PropertySources to the environment.
   */
  private void processPropertySources(ConfigurableEnvironment environment,
      ResourceLoader resourceLoader) {
    PropertySourceProcessor processor = new PropertySourceProcessor(environment, resourceLoader);
    try {
      processor.processPropertySource(new PropertySourceDescriptor("classpath:secrets.properties"));
    } catch (IOException ex) {
      throw new UncheckedIOException(ex);
    }
  }
}
