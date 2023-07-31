/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q5;

/**
 *
 * @author USER
 */
abstract class BankAccount 
{
  private int accountNumber;
  private double balance;
  public void setData(int accountNumber, double balance)
  {
      this.accountNumber=accountNumber;
      this.balance=balance;
  
  }
  public int setaccountNumber()
  {
      return accountNumber;
  }
  public double setbalance()
  {
      return balance;
  }
   public int getaccountNumber()
  {
      return accountNumber;
  }
  public double getbalance()
  {
      return balance;
  }
  
  public abstract void calculateInterest();
}
