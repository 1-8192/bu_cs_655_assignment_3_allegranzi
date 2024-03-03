package edu.bu.met.cs665.customer;

public class NewCustomer extends Customer {
  private final String EMAIL_CONTENT = "We are so excited to have you as a new customer. "
        + "Please click the links below for some amazing savings you will definitely appreciate!";

  private final String EMAIL_SIGNOFF = "This is the beginning of a beautiful friendship,\n"
        + "- Globocorp";

  public NewCustomer(String name) {
    super(name);
    emailBaseTemplate = EMAIL_CONTENT;
    emailSignofftemplate = EMAIL_SIGNOFF;
  }
}
