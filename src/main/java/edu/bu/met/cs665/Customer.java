/**
 * Name: ALESSANDRO ALLEGRANZI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: Customer.java
 * Description: Customer interface that other customer types implement.
 */

package edu.bu.met.cs665;

/**
 * Interface for other customer types to implement. It is also implemented by the Email Decorator
 * abstract class in the decorator pattern. The decorator also "has a" customer class variable.
 */
public interface Customer {
  /**
   * Interface method to generate emails.
   *
   * @return string email content.
   */
  public String generateEmail();
}
