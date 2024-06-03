package ca.tutic.site.services;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EmailService}.
 */
public class EmailService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EmailService apply(RegisteredBean registeredBean, EmailService instance) {
    AutowiredFieldValueResolver.forRequiredField("emailSender").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
