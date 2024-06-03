package ca.tutic.site;

import ca.tutic.site.services.EmailService;
import ca.tutic.site.services.StaticService;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.web.servlet.LocaleResolver;

/**
 * Bean definitions for {@link SiteController}.
 */
public class SiteController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'siteController'.
   */
  private static BeanInstanceSupplier<SiteController> getSiteControllerInstanceSupplier() {
    return BeanInstanceSupplier.<SiteController>forConstructor(StaticService.class, EmailService.class, LocaleResolver.class)
            .withGenerator((registeredBean, args) -> new SiteController(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'siteController'.
   */
  public static BeanDefinition getSiteControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SiteController.class);
    beanDefinition.setInstanceSupplier(getSiteControllerInstanceSupplier());
    return beanDefinition;
  }
}
