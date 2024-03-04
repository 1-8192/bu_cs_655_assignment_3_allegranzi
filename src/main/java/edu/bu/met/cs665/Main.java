/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: Main.java
 * Description: Main executable class to run the program.
 */

package edu.bu.met.cs665;

/**
 * This is the Main class. used to test the custommer factory, which creates different
 * customer classes that show different emails.
 */
public class Main {

  /**
   * A main method to run examples.
   * I have set up 5 examples for each customer type requested in the assignment.
   */
  public static void main(String[] args) {
    System.out.println("Welcome to Globocorp's email generator. Please see below some "
          + "hard-coded examples of how we create customer specific emails using "
          + "appropriate templates.\n");

    // New Customer case.
    ConcreteCustomer newCustomer = new ConcreteCustomer("Tom");
    NewCustomerEmailDecorator newCustomerEmailDecorator =
          new NewCustomerEmailDecorator(newCustomer);
    newCustomerEmailDecorator.setAdditionalText(
          "Check out these offers only valid for new customers!");
    System.out.println(newCustomerEmailDecorator.generateEmail() + "\n");

    // VIP Customer case.
    ConcreteCustomer vipCustomer = new ConcreteCustomer("Giselle");
    VipCustomerEmailDecorator vipCustomerEmailGenerator =
          new VipCustomerEmailDecorator(vipCustomer);
    vipCustomerEmailGenerator.setAdditionalText(
          "Want to fly in a private jet to a Michelin star restaurant?!");
    System.out.println(vipCustomerEmailGenerator.generateEmail() + "\n");

    // Frequent Customer case.
    ConcreteCustomer freqCustomer = new ConcreteCustomer("Karen");
    FrequentCustomerEmailDecorator freqCustomerEmailGenerator =
          new FrequentCustomerEmailDecorator(freqCustomer);
    freqCustomerEmailGenerator.setAdditionalText("BOGO sales all day!");
    System.out.println(freqCustomerEmailGenerator.generateEmail() + "\n");

    // Business Customer case.
    ConcreteCustomer busCustomer = new ConcreteCustomer("Mr. James Esquire");
    BusinessCustomerEmailDecorator busCustomerEmailGenerator =
          new BusinessCustomerEmailDecorator(busCustomer);
    busCustomerEmailGenerator.setAdditionalText(
          "Would you like to travel together to the business expo?");
    System.out.println(busCustomerEmailGenerator.generateEmail() + "\n");

    // Returning Customer case.
    ConcreteCustomer retCustomer = new ConcreteCustomer("Tyson");
    ReturningCustomerEmailDecorator retCustomerEmailGenerator =
          new ReturningCustomerEmailDecorator(retCustomer);
    retCustomerEmailGenerator.setAdditionalText(
          "use promo code TWICE for more savings.");
    System.out.println(retCustomerEmailGenerator.generateEmail() + "\n");
  }
}
