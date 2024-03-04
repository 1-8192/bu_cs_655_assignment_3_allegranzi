/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: TestConcreteCustomer.java
 * Description: Test class for concrete customer.
 */

package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test cases for Concrete Customer.
 */
public class TestConcreteCustomer {
  @Test
  public void testGenerateEmail() {
    ConcreteCustomer customer = new ConcreteCustomer("Michael Jordan");
    assertEquals("Dear Michael Jordan", customer.generateEmail());
  }

  @Test
  public void testGenerateEmailWithEmptyName() {
    ConcreteCustomer customer = new ConcreteCustomer("");
    assertEquals("Dear Lovely Human", customer.generateEmail());
  }

  @Test
  public void testGenerateEmailWithNullName() {
    ConcreteCustomer customer = new ConcreteCustomer(null);
    assertEquals("Dear Lovely Human", customer.generateEmail());
  }
}
