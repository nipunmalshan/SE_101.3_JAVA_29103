/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q5;

/**
 *
 * @author USER
 */
public class SavingsAccount extends BankAccount 
{
    private static final double SAVINGS_INTEREST_RATE=0.12;
    @Override
    public void calculateInterest()
    {
     double interset = setbalance()* SAVINGS_INTEREST_RATE;
        System.out.println("The interest for saving account is");
    }
}
