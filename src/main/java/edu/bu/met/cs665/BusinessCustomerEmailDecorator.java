/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: Business CustomerEmailDecorator.java
 * Description: concrete decorator class for business customers.
 */

package edu.bu.met.cs665;

/**
 * Concrete decorator to generate emails for business customers.
 */
public class BusinessCustomerEmailDecorator extends EmailDecorator {

  /**
   * Class constructor that sets up the specific email template for business customers.
   *
   * @param customer customer instance.
   */
  public BusinessCustomerEmailDecorator(ConcreteCustomer customer) {
    super(customer);
    this.emailBaseTemplate = "B2B clients are incredibly important to Globocorp. Out industries are filled with "
          + "synergy and the potential to do even more business together. Please read more below:";
    this.emailSignofftemplate = "We work better 2gether!\n"
          + "- Globocorp";
  }
}
