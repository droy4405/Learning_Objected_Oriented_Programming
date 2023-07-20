/* Introduction to Object-Oriented Programming with Java I: Foundations and Syntax Basics: HW01
   Date: July 13, 2023
   Author: Dibyendu Roy
   Purpose: 
   This homework will be split into two parts - the first will be focused on working with the various primitive types that Java provides us. The second will be focused on using methods that come with the String class. Additionally, this homework requires you to do some basic debugging on erroneous code that we have provided with this document and to submit some information to help us get to know you better.
Section 1: Primitive Operations

All of the instructions in this section should be carried out in the class PrimitiveOperations, in the main method, and must be in the respective order.

    First, declare and initialize two variables, an integer type (byte, short, int, or long) and a floating point value (float or double). The names and values can be whatever you like, for this step and all others. Make sure that the numbers you choose can be stored within the respective primitive type you choose. Print each of these values out on their own line using System.out.println().
    Multiply these variables together, and assign the outcome to a new variable, ensuring that no data is lost. For example, if I multiply 5 and 3.5, the answer should be 17.5.Print out this new value.
    Use casting to convert the integer from the first step to a floating point value and store that in another new variable. Print out the value.
    Use casting to convert the floating point value from the first step to an integer type and store that in a new variable. Print out the value.
    Shifting focus, declare a char variable, and assign an uppercase letter to it. Print out this value.
    Using a numerical operation, change the letter to the same letter, but in lowercase. Use a numerical operation - do not reassign the variable. You may want to review a table of ASCII values as you’re working on this section. Print out the new char value. Hint: you’ll likely have to use casting to get this to work.

Section 2 - String Methods

All of the instructions in this section should be carried out in the class StringOperations, in the main method.

    Create a new String object and assign it your name. Print it out.
    Pick the first letter in your name, and replace it with ‘A’. Then, replace the last letter in your name with ‘Z’. Print out the result. Recall that, in Java, strings are immutable, meaning you cannot change a String in-place. Do NOT just hard-code a new String with the first and last letters changed.
    Lastly, let’s work with some URLs.  Declare a new String and give it the value of some web address, in the form www.name.tld, such as www.gatech.edu or www.stackoverflow.com. Print out this address.
    This last operation could be a little tricky. Create a substring of the variable that’s just the “name” section, and concatenate the integer “1331” to the end. For example, www.gatech.edu would become gatech1331. Print out this final result. Note: the String class has a .length()method which you’ll likely find useful here but is not necessary.

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
