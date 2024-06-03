package org.springframework.boot.autoconfigure.mail;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MailSenderAutoConfiguration}.
 */
public class MailSenderAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'mailSenderAutoConfiguration'.
   */
  public static BeanDefinition getMailSenderAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MailSenderAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(MailSenderAutoConfiguration::new);
    return beanDefinition;
  }
}
