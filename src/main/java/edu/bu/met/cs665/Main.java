/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: Main.java
 * Description: Main executable class to run the program.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.Customer;

/**
 * This is the Main class. used to test the custommer factory, which creates different customer classes
 * that show different emails.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {

    CustomerFactory customerFactory = new CustomerFactory();
    Customer newCustomer = customerFactory.createNewCustomer("Billy");
    Customer vipCustomer = customerFactory.createVipCustomer("Wilhelm");

    System.out.println(newCustomer.generateEmail("We think you'd like these items.") + "\n");
    System.out.println(vipCustomer.generateEmail(
          "We think you'd like to travel in a private jet") + "\n");
  }
}
