
package com.mycompany.q6;

import java.util.Scanner;
public class Q6 {

    public static void main(String[] args) 
    {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter the first number:");
            x=sc.nextInt();
            System.out.println("Enter the second number");
            y=sc.nextInt();
            z=x/y;
            System.out.println("Answer is:"+z);
        
        }
        catch(Exception e)
        {
            System.out.println("Number devide by Zero error");
        }
    }
}
