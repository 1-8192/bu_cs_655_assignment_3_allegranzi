/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: NewCustomerEmailDecorator.java
 * Description: concrete decorator class for new customers.
 */

package edu.bu.met.cs665;

/**
 * Concrete decorator to generate emails for new customers.
 */
public class NewCustomerEmailDecorator extends EmailDecorator {

  /**
   * Class constructor that sets up the specific email template for new customers.
   *
   * @param customer customer instance.
   */
  public NewCustomerEmailDecorator(ConcreteCustomer customer) {
    super(customer);
    this.emailBaseTemplate = "We are so excited to have you as a new customer. "
          + "Please click the links below for some amazing savings you will definitely appreciate!";
    this.emailSignofftemplate = "This is the beginning of a beautiful friendship,\n"
          + "- Globocorp";
  }
}
