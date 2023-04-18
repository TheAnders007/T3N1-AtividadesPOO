package br.edu.principal;

import java.util.Scanner;

public class Principal
{
  public static void main(String args[])
  { 
   int i = 4, ultNum = 4, numTerm, num1 = 2, num2 = 7, num3 = 3;
    
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Digite o número de termos:");
   numTerm = sc.nextInt();
   
   System.out.print("A sequência será: ");
   if (numTerm == 1){
     System.out.print(num1 + ". ");
   }
   if (numTerm == 2){
     System.out.print(num1 + ", ");
     System.out.print(num2 + ". ");
   }
   if (numTerm == 3){
     System.out.print(num1 + ", ");
     System.out.print(num2 + ", ");
     System.out.print(num3 + ". ");
   }
   
   if (numTerm > 3){
     System.out.print(num1 + ", ");
     System.out.print(num2 + ", ");
     System.out.print(num3 + ", ");
   
     while (i <= numTerm){
       if (i < numTerm){
                      
       if (num3 == 3){
         num1 = 4;
       }
      
       System.out.print(num1 + ", ");
       ++i;
       num2 = 3 * num2;
       ultNum = num2;
      
       if (i < numTerm){
        System.out.print(num2 + ", ");
        ++i;
        num3 = 4 * num3;
        ultNum = num3;
        if (i < numTerm){
          System.out.print(num3 + ", ");
          ++i;
          num1 = 2 * num1;
          ultNum = num1;
        }
       }
      }
     else{
      System.out.print(ultNum + ".");
      ++i;
     }
    }
   }
  }
}
