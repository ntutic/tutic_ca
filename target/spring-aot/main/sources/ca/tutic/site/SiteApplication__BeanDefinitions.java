package ca.tutic.site;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link SiteApplication}.
 */
public class SiteApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'siteApplication'.
   */
  public static BeanDefinition getSiteApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SiteApplication.class);
    beanDefinition.setTargetType(SiteApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(SiteApplication.class);
    beanDefinition.setInstanceSupplier(SiteApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
