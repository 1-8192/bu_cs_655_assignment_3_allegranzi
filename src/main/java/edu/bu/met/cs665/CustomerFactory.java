package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.*;

public class CustomerFactory {
  public Customer createNewCustomer(String name) {
    return new NewCustomer(name);
  }

  public Customer createBusinessCustomer(String name) {
    return new BusinessCustomer(name);
  }

  public Customer createFrequentCustomer(String name) {
    return new FrequentCustomer(name);
  }

  public Customer createReturningCustomer(String name) {
    return new ReturningCustomer(name);
  }

  public Customer createVipCustomer(String name) {
    return new VipCustomer(name);
  }
}
