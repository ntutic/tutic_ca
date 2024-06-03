package ca.tutic.site.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.web.servlet.LocaleResolver;

/**
 * Bean definitions for {@link StaticService}.
 */
public class StaticService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'staticService'.
   */
  private static BeanInstanceSupplier<StaticService> getStaticServiceInstanceSupplier() {
    return BeanInstanceSupplier.<StaticService>forConstructor(ObjectMapper.class, LocaleResolver.class)
            .withGenerator((registeredBean, args) -> new StaticService(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'staticService'.
   */
  public static BeanDefinition getStaticServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(StaticService.class);
    beanDefinition.setInstanceSupplier(getStaticServiceInstanceSupplier());
    return beanDefinition;
  }
}
