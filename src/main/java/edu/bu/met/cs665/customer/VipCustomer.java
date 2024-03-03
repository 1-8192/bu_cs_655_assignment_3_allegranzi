package edu.bu.met.cs665.customer;

public class VipCustomer extends Customer {
  private final String EMAIL_CONTENT = "You matter more to us than other customer. You are firtst class" +
        " and a true VIP. Please click the links below for some bespoke experiences we do not offer to " +
        "other, lesser clients. You're a rockstar!";

  public VipCustomer(String name) {
    super(name);
    emailText = EMAIL_CONTENT;
  }
}
