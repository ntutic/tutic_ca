package ca.tutic.site.configs;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link SecretsConfig}.
 */
public class SecretsConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'secretsConfig'.
   */
  public static BeanDefinition getSecretsConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SecretsConfig.class);
    beanDefinition.setTargetType(SecretsConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(SecretsConfig.class);
    beanDefinition.setInstanceSupplier(SecretsConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
