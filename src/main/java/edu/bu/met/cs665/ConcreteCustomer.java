/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: ConcreteCustomer.java
 * Description: concrete wrappee class for customers.
 */

package edu.bu.met.cs665;

/**
 * Concrete customer class that will be wrapped by concrete decorators.
 */
public class ConcreteCustomer implements Customer {

  /**
   * The customer's name. Default set in case of empty strings or nulls.
   */
  protected String name;

  /**
   * Class constructor. Sets default name value if null or "" passed in.
   *
   * @param name customer name.
   */
  public ConcreteCustomer(String name) {
    this.name =  name != null && !name.isEmpty() ? name : "Lovely Human";
  }

  /**
   * Interface method that will be called by the decorator to add behavior.
   *
   * @return string base of email text.
   */
  public String generateEmail() {
    return "Dear " + name;
  }
}
