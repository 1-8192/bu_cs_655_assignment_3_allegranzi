/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: Frequent CustomerEmailDecorator.java
 * Description: concrete decorator class for frequent customers.
 */

package edu.bu.met.cs665;

/**
 * Concrete decorator to generate emails for frequent customers.
 */
public class FrequentCustomerEmailDecorator extends EmailDecorator {

  /**
   * Class constructor that sets up the specific email template for frequent customers.
   *
   * @param customer customer instance.
   */
  public FrequentCustomerEmailDecorator(ConcreteCustomer customer) {
    super(customer);
    this.emailBaseTemplate = "You shop with us so frequently, we have put together "
          + "some great deals for you as a show of thanks. Hope they keep you "
          + "shopping with us again and again.";
    this.emailSignofftemplate = "Thanks for shopping with us frequently!\n"
          + "- Globocorp";
  }
}
