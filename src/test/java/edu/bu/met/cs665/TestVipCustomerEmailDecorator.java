/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: TestVipCustomerEmailDecorator.java
 * Description: Test class for VIP customer email decorator.
 */

package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test cases for VIP customer concrete decorator.
 */
public class TestVipCustomerEmailDecorator {
  @Test
  public void testGenerateEmail() {
    ConcreteCustomer customer = new ConcreteCustomer("Reginald");
    VipCustomerEmailDecorator vipCustomerDecorator = new VipCustomerEmailDecorator(customer);

    String expectedEmail = "Dear Reginald\n" + "You matter more to us than other customers. You are first class" +
          " and a true VIP. Please click the links below for some bespoke experiences we do not offer to " +
          "other, lesser clients.\n" + "\n" + "You are a rockstar!\n"
          + "- Globocorp";

    assertEquals(expectedEmail, vipCustomerDecorator.generateEmail());
  }

  @Test
  public void testGenerateEmailWithCustomMessage() {
    ConcreteCustomer customer = new ConcreteCustomer("Reginald");
    VipCustomerEmailDecorator vipCustomerDecorator = new VipCustomerEmailDecorator(customer);
    vipCustomerDecorator.setAdditionalText("test text");

    String expectedEmail = "Dear Reginald\n" + "You matter more to us than other customers. You are first class" +
          " and a true VIP. Please click the links below for some bespoke experiences we do not offer to " +
          "other, lesser clients.\n" + "test text\n" + "You are a rockstar!\n"
          + "- Globocorp";

    assertEquals(expectedEmail, vipCustomerDecorator.generateEmail());
  }
}
