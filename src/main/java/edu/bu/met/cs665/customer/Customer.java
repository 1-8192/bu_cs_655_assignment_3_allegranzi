package edu.bu.met.cs665.customer;

public abstract class Customer {

  protected String name;

  protected String emailText;

  public Customer(String name) {
    this.name = name;
  }

  public String generateEmail() {
    return "Dear " + name + "\n" + emailText;
  };
}
