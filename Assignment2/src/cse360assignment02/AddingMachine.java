/**
 * Add and subtract given values to a stored total. The record of operations is saved 
 * and returned as a String.
 * 
 * int      total    the total value after operations are performed
 * String   record   history of performed operations saved as a string
 */

package cse360assignment02;

public class AddingMachine {
  private int total;
  private String record;
  
  /**
   * Constructor, accepts no arguments and sets default values to 0
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    record = "0";
  }
  
  /**
   * Returns the total sum yielded by the performed operations.
   * 
   * @return total  Total is the sum of all operations stored in the object
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * This method adds an integer to the total and is appended, 
   * as a string, to the record.
   * 
   * @param value  The chosen value to add
   */
  public void add (int value) {
	  this.total += value;
	  record = record + " + " + value;
  }

  /**
   * This method subtracts an integer to the total and is appended, 
   * as a string, to the record.
   * 
   * @param value  The chosen value to subtract
   */
  public void subtract (int value) {
	  this.total -= value;
	  record = record + " - " + value;
  }

  /**
   * Returns the history of performed operations on the AddingMachine object.
   * 
   * @return record  This is a String which holds the operation record in the form
   * 				 "x + y - z"
   */
  public String toString () {
    return record;
  }

  
  /**
   * Returns the total sum to 0 and erases the operation record of the object.
   */
  public void clear() {
	  total = 0;  
	  record = "0";
  }
}