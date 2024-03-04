/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: VipCustomerEmailDecorator.java
 * Description: concrete decorator class for VIP customers.
 */

package edu.bu.met.cs665;

/**
 * Concrete decorator to generate emails for VIP customers.
 */
public class VipCustomerEmailDecorator extends EmailDecorator {

  /**
   * Class constructor that sets up the specific email template for VIP customers.
   *
   * @param customer customer instance.
   */
  public VipCustomerEmailDecorator(ConcreteCustomer customer) {
    super(customer);
    this.emailBaseTemplate = "You matter more to us than other customers. You are first class" +
    " and a true VIP. Please click the links below for some bespoke experiences we do not offer to " +
          "other, lesser clients.";
    this.emailSignofftemplate = "You are a rockstar!\n"
          + "- Globocorp";
  }
}
