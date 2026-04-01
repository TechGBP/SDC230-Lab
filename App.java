/*  
Name: Gabriela Balanta
Date: 04-1-2026
Assignment: make the user interactions for the calculator
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("Gabriela Balanta - Week 1 - 1.4 Project - User Interactions and I/O");
        String hello = "Hi! Welcome to Gabriela Balanta's Java calculator";
        System.out.println();
        System.out.println(hello);
 
        int count = 5; /* used to control while loop */
        double num1, num2, answer; /* used to store value for user input */
        /* make scanner for user input */
        Scanner scanner = new Scanner(System.in);

        while(count>2){  /* loops for repeated use */
            System.out.println("Main Menu");
            System.out.println("Enter the corresponding number for your selection: ");
            System.out.println("\t1 for addition");
            System.out.println("\t2 for subtraction");
            System.out.println("\t3 for multiplication");
            System.out.println("\t4 for division");
            System.out.println("\t5 to exit");
            /* vairable for user choice */
             int choice = scanner.nextInt(); 

        if(choice == 5)
            {
            count=count-7; /*closes while loop to exit */
            System.out.println("Thank you for using this calcualtor.");
            }
        if(choice==1)  /* user choose addition */
            {
            System.out.println("You choose addition.");
            System.out.println("Enter first number (can have decimals):");
            num1 = scanner.nextDouble();
            System.out.println("Enter second number(can have decimals):");
            num2 = scanner.nextDouble();
            System.out.printf("%s + %s = ? %n", num1, num2);
            answer = num1 + num2;
            System.out.printf("Answer is %.3f%n%n", answer);
            }
        if(choice==2) /* user choose subtraction */
            {
            System.out.println("You choose subtraction.");
            System.out.println("Enter first number(can have decimals):");
            num1 = scanner.nextDouble();
            System.out.println("Enter second number(can have decimals):");
            num2 = scanner.nextDouble();
            System.out.printf("%s - %s = ? %n", num1, num2);
            answer = num1 - num2;
            System.out.printf("Answer is %.3f%n%n", answer);
            }
        if(choice==3) /* user choose multiplication */
            {
            System.out.println("You choose multiplication.");
            System.out.println("Enter first number(can have decimals):");
            num1 = scanner.nextDouble();
            System.out.println("Enter second number(can have decimals):");
            num2 = scanner.nextDouble();
            System.out.printf("%s * %s = ? %n", num1, num2);
            answer = num1 * num2;
            System.out.printf("Answer is %.3f%n%n", answer);
            }
        if(choice==4)   /* user choose division */
            {
            System.out.println("You choose division.");
            System.out.println("Enter first number(can have decimals):");
            num1 = scanner.nextDouble();
            System.out.println("Enter second number(can have decimals):");
            num2 = scanner.nextDouble();
            System.out.printf("%s / %s = ? %n", num1, num2);
            answer = num1 / num2;
            System.out.printf("Answer is %.3f%n%n", answer);
            }
        
        }
        /* closes the scanner */
        scanner.close(); 
    }
}
