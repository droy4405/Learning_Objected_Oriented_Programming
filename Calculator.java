* Introduction to Object-Oriented Programming with Java I: Foundations and Syntax Basics: HW01
   Date: July 19, 2023
   Author: Dibyendu Roy
   Purpose: 
   For homework 02, I will be creating a calculator that can perform the following operations: add, subtract, multiply, divide, and alphabetize. The operations work as follows:

    add - takes two integers, adds them together and prints out the result
    subtract - takes two integers, subtracts the second entered integer from the first and prints out the result
    multiply - takes two doubles, multiplies them together and prints out the result to two decimal places
    divide - takes two doubles, divides the first entered double by the second and prints out the result to two decimal places
    alphabetize - takes two words of only letters, and tells which word comes before the other lexicographically

   */

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("List of operations:\nadd\nsubtract\nmultiply\ndivide\nalphabetize");
        
        System.out.println("Enter an operation:");
        String InputOperation = input.next();
       
        String operation = InputOperation.toLowerCase();
        
        switch (operation){
            case "add":
                System.out.println("Enter two integer numbers: ");
                if (input.hasNextInt()){
                    int var1 = input.nextInt();
                    int var2 = input.nextInt();
                    System.out.println("Answer:"+ (var1 + var2));
                    break;
                }
                else{
                     System.out.println("Invalid input. Terminating program...");
                     break;
               }
               
               case "subtract":
                   System.out.println("Enter two integer numbers: ");
                   if (input.hasNextInt()){
                        int var1 = input.nextInt();
                        int var2 = input.nextInt();
                        System.out.println("Answer:"+ (var1 - var2));
                        break;
                    }
                    else{
                         System.out.println("Invalid input. Terminating program...");
                         break;
                    }
                    
                case "multiply":
                   System.out.println("Enter two double numbers: ");
                   if (input.hasNextDouble()){
                        double var1 = input.nextDouble();
                        double var2 = input.nextDouble();
                        double result = var1 * var2;
                        System.out.printf("Answer: %.2f \n", result);
                        break;
                    }
                    else{
                         System.out.println("Invalid input. Terminating program...");
                         break;
                    }
                case "divide":
                   System.out.println("Enter two double numbers: ");
                   if (input.hasNextDouble()){
                        double var1 = input.nextDouble();
                        double var2 = input.nextDouble();
                        if (var2 == 0){
                            System.out.println("Invalid input. Terminating program...");
                            break;
                        }
                        double result = (var1 / var2);
                        System.out.printf("Answer: %.2f \n", result);
                        break;
                    }
                    else{
                         System.out.println("Invalid input. Terminating program...");
                         break;
                    }
                case "alphabetize":
                   System.out.println("Enter two words ");
                   String wordVal1 = input.next();
                   String wordVal2 = input.next();
                   
                   String word1 = wordVal1.toLowerCase();
                   String word2 = wordVal2.toLowerCase();
                   /*
                   String firstLetter = word1.substring(0,1);
                   String secondLetter = word2.substring(0,1);
                   
                   System.out.println("First letters are " + firstLetter + secondLetter);
                   */
                   if (word1.compareTo(word2) > 0){
                       System.out.println("Answer: " + wordVal2 + " comes before " +wordVal1);
                   }
                   else if(word1.compareTo(word2) < 0){
                       System.out.println("Answer: " + wordVal1 + " comes before " +wordVal2);
                   }
                   else{
                       System.out.println("Answer: Chicken or Egg");
                   }
                   break;
                   default:
                      System.out.println("Invalid input. Terminating program...");
                         break;
        }
         
    }
}
