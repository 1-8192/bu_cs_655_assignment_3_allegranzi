/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: EmailDecorator.java
 * Description: abstract decorator class that concrete decorators will extend.
 */

package edu.bu.met.cs665;

/**
 * Abstract decorator class. Concrete decorators will extend it, and it implements the
 * customer interface. It also "has a" customer variable.
 */
public abstract class EmailDecorator implements Customer {
  /**
   * decorated Customer instance.
   */
  protected Customer customer;

  /**
   * email template string.
   */
  protected String emailBaseTemplate;

  /**
   * email signoff string.
   */
  protected String emailSignofftemplate;

  /**
   * Additional text to insert into "body" of email. Defaults to empty string in case
   * no specific message is desired.
   */
  protected String additionalText = "";

  /**
   * Class constructor. Just take in the Customer instance.
   *
   * @param customer the customer.
   */
  public EmailDecorator(Customer customer) {
    this.customer = customer;
  }

  /**
   * Sets additional text for email.
   *
   * @param message the text to add to emails.
   */
  public void setAdditionalText(String message) {
    additionalText = message;
  }

  /**
   * Generates full email by adding templates and any set additional text to email. Calls the
   * customer instance's generateEmail() method in line with the Decorator pattern.
   *
   * @return string the email.
   */
  public String generateEmail() {
    return customer.generateEmail() + "\n" + emailBaseTemplate + "\n"
          + additionalText + "\n" + emailSignofftemplate;
  }
}
