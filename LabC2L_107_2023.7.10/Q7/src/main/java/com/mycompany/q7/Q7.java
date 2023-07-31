
package com.mycompany.q7;


public class Q7 {

    public static void main(String[] args) 
    {
        int no1=10,no2=2,ans;
        int arr[]=new int[5];
        try
        {
            
            ans=no1/no2;
            System.out.println("Answer is:");
            arr[4]=25;
            System.out.println("Last element is"+arr[4]);
            
        }
         catch(ArithmeticException e)
         {
             System.out.println("Number devide by Zero error");
         }
          catch(ArrayIndexOutOfBoundsException e)
          {
              System.out.println("arry index error");
          
          }
        
    }
}
