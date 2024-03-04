/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: Returning CustomerEmailDecorator.java
 * Description: concrete decorator class for returning customers.
 */

package edu.bu.met.cs665;

/**
 * Concrete decorator to generate emails for returning customers.
 */
public class ReturningCustomerEmailDecorator extends EmailDecorator {

  /**
   * Class constructor that sets up the specific email template for returning customers.
   *
   * @param customer customer instance.
   */
  public ReturningCustomerEmailDecorator(ConcreteCustomer customer) {
    super(customer);
    this.emailBaseTemplate = "We noticed you've shopped with us before! We are flattered you find our products "
          + "and service worth trying again. We'd like to extend some offers below to keep you coming back again!";
    this.emailSignofftemplate = "Thanks for shopping with us one more time!\n"
          + "- Globocorp";
  }
}
