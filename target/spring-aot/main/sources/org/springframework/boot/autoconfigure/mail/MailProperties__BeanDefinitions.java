package org.springframework.boot.autoconfigure.mail;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MailProperties}.
 */
public class MailProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'mailProperties'.
   */
  public static BeanDefinition getMailPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MailProperties.class);
    beanDefinition.setInstanceSupplier(MailProperties::new);
    return beanDefinition;
  }
}
