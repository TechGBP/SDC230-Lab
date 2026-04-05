/*  
Name: Gabriela Balanta
Date: 04-4-2026
Assignment: exceptions handling 
*/

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;


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
            throw new ArithmeticException("Error: Cannot divide by zero."); /* throw exception for division by zero */
        }
        return num1 / num2;
        }
    }

    static class singleMem { /* used to store a single value in memory    singleMem is short for single memory */
        private Double memVal = null; /* for single value storage */
        public void run(Scanner scanner) {
           int singMenu = 5;
                while(singMenu>2){
                    System.out.println("Hi! Welcome to the Single Value Memory.");
                    System.out.println("Memory (Single Value) Menu");
                    System.out.println("Enter the corresponding number for your selection: ");
                    System.out.println("\t1 to Store a value in memory");
                    System.out.println("\t2 to Recall the value in memory");
                    System.out.println("\t3 to Clear memory");
                    System.out.println("\t4 to Exit");
                    int memChoice2;
                    
                    try {
                        memChoice2 = scanner.nextInt();
                        scanner.nextLine(); /* clears buffer */
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a number.");
                        scanner.nextLine(); /* gets rid of invalid user input */
                        continue; /* restart loop */
                    }
                    if( memChoice2 <= 0 || memChoice2 > 4){
                    System.out.println("Please enter a value between 1 and 4!");
                    }
                    if(memChoice2 == 4) /* exits memory menu */
                        {
                        System.out.println("Exiting Memory(Single Value) Menu.");
                        singMenu=singMenu-7; /* closes while loop to exit */
                        }
                    if(memChoice2==1) /* user choose to store a value in memory */
                        {
                        System.out.println("You choose to store a value in memory.");
                        try {
                            System.out.print("Enter a number to store in memory (can have decimals): ");
                            memVal = scanner.nextDouble();
                            scanner.nextLine(); 
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid user input! Please enter numbers only.");
                            scanner.nextLine(); /* gets rid of invalid user input */
                        continue; /* returns to menu */
                        }
                        System.out.printf("%s has been stored in memory.%n%n", memVal);
                        
                        }
                    if(memChoice2==2) /* user choose to recall the value in memory */
                        {
                        System.out.println("You choose to recall the value in memory.");
                            if(memVal == null){
                                System.out.println("No value stored in memory.");
                            } else{
                                System.out.printf("The value stored in memory is: %s%n%n", memVal);
                            }
                            
                        }
                    if(memChoice2==3) /* user choose to clear memory */
                        {
                        System.out.println("You choose to clear memory.");
                        memVal = null;
                        System.out.println("Memory cleared.%n%n");
                        }
                }
        }
    }

    static class multiMem { /* used to store multiple values in memory  multMem is short for multiple memory */
        private ArrayList<Double> memList = new ArrayList<>(); /* for multiple value storage */

        public void run(Scanner scanner) {
            int multMenu = 5;
                while(multMenu>2){
                    System.out.println("Hi! Welcome to the Multiple Value Memory.");
                    System.out.println("Memory (Multiple Values) Menu");
                    System.out.println("Enter the corresponding number for your selection: ");
                    System.out.println("\t1 to Add a value in memory");
                    System.out.println("\t2 to Remove a value from memory");
                    System.out.println("\t3 to Display all a values in memory");
                    System.out.println("\t4 to Count values");
                    System.out.println("\t5 to Sum all values");
                    System.out.println("\t6 to Average all values");
                    System.out.println("\t7 to Difference (first value from last value)");
                    System.out.println("\t8 to Exit");

                    int memChoice3;
                    
                    try {
                        memChoice3 = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a number.");
                        scanner.nextLine(); /* gets rid of invalid user input */
                        continue; /* restart loop */
                    }
                    if( memChoice3 <= 0 || memChoice3 > 8){
                    System.out.println("Please enter a value between 1 and 8!");
                    }
                    if(memChoice3 == 8) /* exits memory menu */
                        {
                        System.out.println("Exiting Memory(Multiple Values) Menu.");
                        multMenu=multMenu-7; /* closes while loop to exit */
                        }
                    if(memChoice3==1) /* user choose to store a value in memory */
                        {
                        System.out.println("You choose to store a value in memory.");
                            if(memList.size() >= 10){
                                System.out.println("Memory is full! Please remove a value before adding a new one.");
                            } else {
                                System.out.println("You can store up to 10 values in memory.");
                                try {
                                    System.out.print("Enter a number to store in memory (can have decimals): ");
                                    double memVal2 = scanner.nextDouble();
                                    scanner.nextLine(); 
                                    memList.add(memVal2);
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid user input! Please enter numbers only.");
                                    scanner.nextLine(); /* gets rid of invalid user input */
                                continue; /* returns to menu */
                                }
                                System.out.printf("Value has been stored in memory.%n%n");
                            }
                            
                        }
                    if(memChoice3==2) /* user choose to recall the values in memory */
                        {
                        System.out.println("You choose to recall a value stored in memory.");
                        int storedVal = scanner.nextInt();
                        scanner.nextLine();
                            if(storedVal >= 0 && storedVal < memList.size()){
                                memList.remove(storedVal);
                                System.out.printf("Value has been removed from memory.");
                            } else {
                                System.out.println("Invalid input! Please enter a number between 1 and " + memList.size());
                            } 
                        }
                    if(memChoice3==3) /* user choose to clear memory */
                        {
                        System.out.println("You choose to view all values in stored in memory.");
                        System.out.println("Values currently stored in memory:" + memList);
                        }
                    if(memChoice3==4) /* user choose to count values in memory */
                        {
                        System.out.println("You choose to count values in memory.");
                        System.out.println("Number of values currently stored in memory: " + memList.size());
                        }
                    if(memChoice3==5) /* user choose to sum values in memory */
                        {
                        System.out.println("You choose to sum values in memory.");
                        double sum = 0;
                        for (double value : memList) {
                            sum += value;
                        }
                        System.out.println("Sum of values currently stored in memory: " + sum);
                        }
                    if(memChoice3==6) /* user choose to average values in memory */
                        {
                        System.out.println("You choose to average values in memory.");
                            if (memList.size() == 0) {
                                System.out.println("No values arestored in memory to average.");
                            } else {
                                double sum = 0;
                                for (double value : memList) {
                                    sum += value;
                                }
                                double average = sum / memList.size();
                                System.out.println("Average of values currently stored in memory: " + average);
                            }
                            
                        }
                    if(memChoice3==7) /* user choose to find the difference between the first and last value stored in memory */
                        {
                        System.out.println("You choose to find the difference between the first and last value in memory.");
                            if (memList.size() == 0) {
                                System.out.println("No values are stored in memory.");
                            } else {
                                double firstValue = memList.get(0);
                                double lastValue = memList.get(memList.size() - 1);
                                double difference = lastValue - firstValue;
                                System.out.println("Difference between the first and last value in memory: " + difference);
                            }
                        
                    }
                    
                } /* end of multiple menu while loop */
        }
        
    } 


    public static void main(String[] args) throws Exception { 
        System.out.println();
        System.out.println("Gabriela Balanta - Week 4 - 4.2 Project - Exception Handling" );
        String hello = "Hi! Welcome to Gabriela Balanta's Java calculator";
        System.out.println();
        System.out.println(hello);
 
        /* make scanner for user input */
        Scanner scanner = new Scanner(System.in);
        int count = 5; /* used to control while loop */
        int mainMenu = 5; /* used to control main menu while loop */
        int choice = 0; /* used to store user menu choice */
        double num1, num2, answer; /* used to store value for user input */

        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();
        singleMem singleMem = new singleMem();
        multiMem multiMem = new multiMem();
        

        while (mainMenu > 2) { /* loops for repeated use of main menu */
            System.out.println("Main Menu");
            System.out.println("\t1 for Calculator Menu");
            System.out.println("\t2 for Memory(Single Value)");
            System.out.println("\t3 for Memory(Multiple Values)");
            System.out.println("\t4 to Exit");

            try{
                System.out.print("Enter Selection: ");
                choice = scanner.nextInt();
                scanner.nextLine();  /* clears buffer */
            }catch(InputMismatchException e){
                System.out.println("Invalid input! Enter a number between 1 and 4.");
                scanner.nextLine(); // clear the bad input
                continue; /* restart loop*/ 
            }
            if (choice == 4) {
                System.out.println("You have chosen to close the program. Goodbye!");
                mainMenu = mainMenu - 7; /* exits program */
            }
            if (choice == 1) {
                while(count>2){  /* loops for repeated use */
                    System.out.println("Welcome to the calculator!");
                    System.out.println("Calculator Menu");
                    System.out.println("Enter the corresponding number for your selection: ");
                    System.out.println("\t1 for Addition");
                    System.out.println("\t2 for Subtraction");
                    System.out.println("\t3 for Multiplication");
                    System.out.println("\t4 for Division");
                    System.out.println("\t5 to Exit");
                    /* vairable for user choice */
                    int choice1;
                    
                try {
                    choice1 = scanner.nextInt();
                    scanner.nextLine(); /* clears buffer */
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a number.");
                    scanner.nextLine(); /* gets rid of invalid user input */
                    continue; /* restart loop */
                }

                if( choice1 <= 0 || choice1 > 5){
                  System.out.println("Please enter a value between 1 and 5!");
                }
                if(choice1 == 5) /* exits calculator */
                    {
                    count=count-7; /*closes while loop to exit */
                    System.out.println("Thank you for using this calcualtor.");
                    
                    }
                if(choice1==1)  /* user choose addition */
                    {
                    System.out.println("You choose addition.");
                    try {
                        System.out.print("Enter first number (can have decimals): ");
                        num1 = scanner.nextDouble();
                        scanner.nextLine(); /* clears buffer */
                        System.out.print("Enter second number (can have decimals): ");
                        num2 = scanner.nextDouble();
                        scanner.nextLine();
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
                if(choice1==2) /* user choose subtraction */
                    {
                    System.out.println("You choose subtraction.");
                    try {
                        System.out.print("Enter first number (can have decimals): ");
                        num1 = scanner.nextDouble();
                        scanner.nextLine(); /* clears buffer so that the menues function correctly  */
                        System.out.print("Enter second number (can have decimals): ");
                        num2 = scanner.nextDouble();
                        scanner.nextLine(); 
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid user input! Please enter numbers only.");
                        scanner.nextLine(); 
                    continue; 
                    }
                    System.out.printf("%s - %s = ? %n", num1, num2);
                    answer = sub.calculate(num1, num2);
                    System.out.printf("Answer is %.3f%n%n" + answer);
                    }
                if(choice1==3) /* user choose multiplication */
                    {
                    System.out.println("You choose multiplication.");
                    try {
                        System.out.print("Enter first number (can have decimals): ");
                        num1 = scanner.nextDouble();
                        scanner.nextLine(); 
                        System.out.print("Enter second number (can have decimals): ");
                        num2 = scanner.nextDouble();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid user input! Please enter numbers only.");
                        scanner.nextLine(); /* gets rid of invalid user input */
                    continue; /* returns to menu */
                    }
                    System.out.printf("%s * %s = ? %n", num1, num2);
                    answer = mul.calculate(num1, num2);
                    System.out.printf("Answer is %.3f%n%n" + answer);
                    }
                if(choice1==4)   /* user choose division */
                    {
                    System.out.println("You choose division.");
                    boolean validInput = false;

                    while(!validInput) {
                        try {
                            System.out.print("Enter first number (can have decimals): ");
                            num1 = scanner.nextDouble();
                            scanner.nextLine(); 
                            System.out.print("Enter second number (can have decimals): ");
                            num2 = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.printf("%s / %s = ? %n", num1, num2);
                            answer = div.calculate(num1, num2); /* tries division method */
                            System.out.printf("Answer is %.3f%n%n" , answer);
                            validInput = true; /* if division is successful, exit loop */
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid user input! Please enter numbers only.");
                            scanner.nextLine(); /* gets rid of invalid user input */
                        }catch (ArithmeticException e) {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                    }     /* end of while invlid input */  
                    }  /*end of division */
            } /* end of calcualtor while loop */
        } /*  end of main menu choice 1 */
            if (choice == 2) {  /* user choose single value memory */
                singleMem.run(scanner); /* call single value memory method */
                }   /* end of main menu choice 2 */

            if(choice == 3) /* user choose multiple value memory */{
                multiMem.run(scanner); /* call multiple value memory method */
                }   /* end of main menu choice 3 */
        }/* end of  main menu choices */
        /* closes the scanner */
        scanner.close(); 
    } /* end of main method */
} /* end of public class App */
   