/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: Main.java
 * Description: Main executable class to run the program.
 */

package edu.bu.met.cs665;

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

    // New Customer case.
    ConcreteCustomer newCustomer = new ConcreteCustomer("Tom");
    NewCustomerEmailDecorator newCustomerEmailGenerator = new NewCustomerEmailDecorator(newCustomer);
    newCustomerEmailGenerator.setAdditionalText("Check out these offers only valid for new customers!");
    System.out.println(newCustomerEmailGenerator.generateEmail() + "\n");

    // VIP Customer case.
    ConcreteCustomer vipCustomer = new ConcreteCustomer("Giselle");
    VipCustomerEmailDecorator vipCustomerEmailGenerator = new VipCustomerEmailDecorator(vipCustomer);
    vipCustomerEmailGenerator.setAdditionalText("Want to fly in a private jet to a Michelin star restaurant?!");
    System.out.println(vipCustomerEmailGenerator.generateEmail() + "\n");
  }
}
