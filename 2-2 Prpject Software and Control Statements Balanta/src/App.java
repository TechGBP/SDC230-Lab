/*  
Name: Gabriela Balanta
Date: 04-1-2026
Assignment: make the user interactions for the calculator
*/

import java.util.Scanner;
import java.util.InputMismatchException;


public class App {


    static class Addition { /* used to add user numbers together */
        public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}
    static class Subtraction {     /* used to subtract user numbers from each other */
        public double calculate(double num1, double num2) {
        return num1 - num2;
    }
}

    static class Multiplication {       /* used to multiply user numbers together */
        public double calculate(double num1, double num2) {
        return num1 * num2;
    }
}
    static class Division {      /* used to divide a user number from another number */
        public double calculate(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");  
            return 0;
        }
        return num1 / num2;
    }
}


    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("Gabriela Balanta - Week 2 - 2.2 Project - Software Design and Control Statements");
        String hello = "Hi! Welcome to Gabriela Balanta's Java calculator";
        System.out.println();
        System.out.println(hello);
 
        int count = 5; /* used to control while loop */
        double num1, num2, answer; /* used to store value for user input */
        /* make scanner for user input */
        Scanner scanner = new Scanner(System.in);
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();
        

        while(count>2){  /* loops for repeated use */
            System.out.println("Main Menu");
            System.out.println("Enter the corresponding number for your selection: ");
            System.out.println("\t1 for addition");
            System.out.println("\t2 for  subtraction");
            System.out.println("\t3 for multiplication");
            System.out.println("\t4 for division");
            System.out.println("\t5 to exit");
            /* vairable for user choice */
            int choice = 0;
            
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // clear the bad input
                continue; // restart loop
            }
        if( choice <= 0 || choice > 5){
            System.out.println("Please enter a value between 1 and 5!");
        }
        if(choice == 5)
            {
            count=count-7; /*closes while loop to exit */
            System.out.println("Thank you for using this calcualtor.");
            }
        if(choice==1)  /* user choose addition */
            {
            System.out.println("You choose addition.");
            try {
                System.out.print("Enter first number (can have decimals): ");
                num1 = scanner.nextDouble();

                System.out.print("Enter second number (can have decimals): ");
                num2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid user input! Please enter numbers only.");
                scanner.nextLine(); /* gets rid of invalid user input */
            continue; /* returns to menu */
            }
            System.out.printf("%s + %s = ? %n", num1, num2);
            /* calls user method for addition */
            answer = add.calculate(num1, num2);
            System.out.printf("Answer is %.3f%n%n" + answer);
            }
        if(choice==2) /* user choose subtraction */
            {
            System.out.println("You choose subtraction.");
            try {
                System.out.print("Enter first number (can have decimals): ");
                num1 = scanner.nextDouble();

                System.out.print("Enter second number (can have decimals): ");
                num2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid user input! Please enter numbers only.");
                scanner.nextLine(); 
            continue; 
            }
            System.out.printf("%s - %s = ? %n", num1, num2);
            answer = sub.calculate(num1, num2);
            System.out.printf("Answer is %.3f%n%n" + answer);
            }
        if(choice==3) /* user choose multiplication */
            {
            System.out.println("You choose multiplication.");
            try {
                System.out.print("Enter first number (can have decimals): ");
                num1 = scanner.nextDouble();

                System.out.print("Enter second number (can have decimals): ");
                num2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid user input! Please enter numbers only.");
                scanner.nextLine(); /* gets rid of invalid user input */
            continue; /* returns to menu */
            }
            System.out.printf("%s * %s = ? %n", num1, num2);
            answer = mul.calculate(num1, num2);
            System.out.printf("Answer is %.3f%n%n" + answer);
            }
        if(choice==4)   /* user choose division */
            {
            System.out.println("You choose division.");
            try {
                System.out.print("Enter first number (can have decimals): ");
                num1 = scanner.nextDouble();

                System.out.print("Enter second number (can have decimals): ");
                num2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid user input! Please enter numbers only.");
                scanner.nextLine(); /* gets rid of invalid user input */
            continue; /* returns to menu */
            }
            System.out.printf("%s / %s = ? %n", num1, num2);
            answer = div.calculate(num1, num2);
            System.out.printf("Answer is %.3f%n%n" + answer);
            }
        
        }
        /* closes the scanner */
        scanner.close(); 
    }
}
