/* Introduction to Object-Oriented Programming with Java I: Foundations and Syntax Basics: HW01
   Date: July 13, 2023
   Author: Dibyendu Roy
   Purpose: 
   */
 
public class PrimitiveOperations {
    public static void main(String[] args){
    
        int variable1 = 150;
        double variable2 = 35.67;
        System.out.println(variable1);
        System.out.println(variable2);
        
        double result = variable1 * variable2;
        System.out.println(result);
        
        double newVariable1 = (double) variable1;
        System.out.println(newVariable1);
        
        int newVariable2 = (int) variable2;
        System.out.println(newVariable2);
        
        char variable3 = 'U';
        System.out.println(variable3);
        
        int newVariable3 = (int) variable3;
        
        int tempVar = newVariable3 + 32;
        
        char lowerCase = (char) tempVar;
        System.out.println(lowerCase);
   }
}
