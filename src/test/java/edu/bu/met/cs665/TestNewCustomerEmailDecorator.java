/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: TestNewCustomerEmailDecorator.java
 * Description: Test class for new customer email decorator.
 */

package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test cases for the concrete new customer decorator.
 */
public class TestNewCustomerEmailDecorator {
  @Test
  public void testGenerateEmail() {
    ConcreteCustomer customer = new ConcreteCustomer("Michael Jordan");
    NewCustomerEmailDecorator newCustomerDecorator = new NewCustomerEmailDecorator(customer);

    String expectedEmail = "Dear Michael Jordan\n" +
          "We are so excited to have you as a new customer. Please click the links below for some amazing savings "
          + "you will definitely appreciate!\n" + "\n" + "This is the beginning of a beautiful friendship,\n" +
          "- Globocorp";

    assertEquals(expectedEmail, newCustomerDecorator.generateEmail());
  }

  @Test
  public void testGenerateEmailWithCustomMessage() {
    ConcreteCustomer customer = new ConcreteCustomer("Michael Jordan");
    NewCustomerEmailDecorator newCustomerDecorator = new NewCustomerEmailDecorator(customer);
    newCustomerDecorator.setAdditionalText("test text");

    String expectedEmail = "Dear Michael Jordan\n" +
          "We are so excited to have you as a new customer. Please click the links below for some amazing savings "
          + "you will definitely appreciate!\n" + "test text" + "\n"
          + "This is the beginning of a beautiful friendship,\n" + "- Globocorp";

    assertEquals(expectedEmail, newCustomerDecorator.generateEmail());
  }
}
