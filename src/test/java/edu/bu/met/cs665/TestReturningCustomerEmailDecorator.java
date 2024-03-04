/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: TestReturningCustomerEmailDecorator.java
 * Description: Test class for returning customer email decorator.
 */

package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test cases for returning customer concrete decorator.
 */
public class TestReturningCustomerEmailDecorator {
  @Test
  public void testGenerateEmail() {
    ConcreteCustomer customer = new ConcreteCustomer("Charles Barkley");
    ReturningCustomerEmailDecorator retCustomerDecorator = new ReturningCustomerEmailDecorator(customer);

    String expectedEmail = "Dear Charles Barkley\n" + "We noticed you've shopped with us before! "
          + "We are flattered you find our products and service worth trying again. We'd like to extend some "
          + "offers below to keep you coming back again!\n" + "\n" + "Thanks for shopping with us one more time!\n"
          + "- Globocorp";

    assertEquals(expectedEmail, retCustomerDecorator.generateEmail());
  }

  @Test
  public void testGenerateEmailWithCustomMessage() {
    ConcreteCustomer customer = new ConcreteCustomer("Charles Barkley");
    ReturningCustomerEmailDecorator retCustomerDecorator = new ReturningCustomerEmailDecorator(customer);
    retCustomerDecorator.setAdditionalText("test text");

    String expectedEmail = "Dear Charles Barkley\n" + "We noticed you've shopped with us before! "
          + "We are flattered you find our products and service worth trying again. We'd like to extend some "
          + "offers below to keep you coming back again!\n" + "test text" + "\n"
          + "Thanks for shopping with us one more time!\n" + "- Globocorp";

    assertEquals(expectedEmail, retCustomerDecorator.generateEmail());
  }
}
