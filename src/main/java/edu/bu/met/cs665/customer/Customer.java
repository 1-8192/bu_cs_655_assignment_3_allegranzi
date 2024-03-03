package edu.bu.met.cs665.customer;

public abstract class Customer {

  protected String name;

  protected String emailBaseTemplate;

  protected String emailSignofftemplate;

  public Customer(String name) {
    this.name = name;
  }

  public String generateEmail(String additionalText) {
    return "Dear " + name + "\n" + emailBaseTemplate + "\n"
          + additionalText + "\n" + emailSignofftemplate;
  };
}
