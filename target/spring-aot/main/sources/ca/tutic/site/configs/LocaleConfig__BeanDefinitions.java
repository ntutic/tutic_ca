package ca.tutic.site.configs;

import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

/**
 * Bean definitions for {@link LocaleConfig}.
 */
public class LocaleConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'localeConfig'.
   */
  public static BeanDefinition getLocaleConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocaleConfig.class);
    beanDefinition.setTargetType(LocaleConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(LocaleConfig.class);
    beanDefinition.setInstanceSupplier(LocaleConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'messageSource'.
   */
  private static BeanInstanceSupplier<MessageSource> getMessageSourceInstanceSupplier() {
    return BeanInstanceSupplier.<MessageSource>forFactoryMethod(LocaleConfig.class, "messageSource")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(LocaleConfig.class).messageSource());
  }

  /**
   * Get the bean definition for 'messageSource'.
   */
  public static BeanDefinition getMessageSourceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition();
    beanDefinition.setTargetType(MessageSource.class);
    beanDefinition.setInstanceSupplier(getMessageSourceInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'localeResolver'.
   */
  private static BeanInstanceSupplier<LocaleResolver> getLocaleResolverInstanceSupplier() {
    return BeanInstanceSupplier.<LocaleResolver>forFactoryMethod(LocaleConfig.class, "localeResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(LocaleConfig.class).localeResolver());
  }

  /**
   * Get the bean definition for 'localeResolver'.
   */
  public static BeanDefinition getLocaleResolverBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition();
    beanDefinition.setTargetType(LocaleResolver.class);
    beanDefinition.setInstanceSupplier(getLocaleResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'localeChangeInterceptor'.
   */
  private static BeanInstanceSupplier<LocaleChangeInterceptor> getLocaleChangeInterceptorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocaleChangeInterceptor>forFactoryMethod(LocaleConfig.class, "localeChangeInterceptor")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(LocaleConfig.class).localeChangeInterceptor());
  }

  /**
   * Get the bean definition for 'localeChangeInterceptor'.
   */
  public static BeanDefinition getLocaleChangeInterceptorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition();
    beanDefinition.setTargetType(LocaleChangeInterceptor.class);
    beanDefinition.setInstanceSupplier(getLocaleChangeInterceptorInstanceSupplier());
    return beanDefinition;
  }
}
