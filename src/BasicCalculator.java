import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        //creating Scanner object for taking user input
        Scanner input = new Scanner(System.in);
//        Operators operators = new Operators();

        
        //Showing message to user to give the input
        System.out.print("Enter an Expression: ");
        String expression = input.nextLine();

         //removing spaces form expression by using replaceAll method of String class
        expression = expression.replaceAll("\\s", ""); //here \\s denotes the white space

        //finding the operator in the expression by using for each loop
        char operator = ' ';
        for (char op : expression.toCharArray()) {
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                operator = op; // assigning the value of op char in operator for performing operations
                break; //used break if the operator is founded then loop will be terminated
            }
        }

        //now checking the operator is valid or invalid if its invalid then throwing the error to user
        if (operator == ' ') {
            System.out.println("Invalid Operator: valid operators are (+)(-)(*)(/)");
        }
         //now splitting the string to get operands for operation by using split() method form split class
        String[] operands = expression.split("[" + operator + "]");
        double num_1 = Double.parseDouble(operands[0]);
        double num_2 = Double.parseDouble(operands[1]);

        //now performing the calculations based on the operations
        switch (operator) {
            // If the operator is addition
            case '+' -> {
                // Perform addition using the Operators class
                double addition = operators.addition((int) num_1, (int) num_2);
                // Print the result of the addition operation
                System.out.printf("Result %d %s %d = %d", (int) num_1, operator, (int) num_2,(int) addition);
            }
            // If the operator is subtraction
            case '-' -> {
                // Perform subtraction using the Operators class
                double subtraction = operators.subtraction((int) num_1, (int) num_2);
                // Print the result of the subtraction operation
                System.out.printf("Result %d %s %d = %d", (int) num_1, operator, (int) num_2,(int) subtraction);
            }
            // If the operator is multiplication
            case '*' -> {
                // Perform multiplication using the Operators class
                double multiplication = operators.multiplication((int) num_1, (int) num_2);
                // Print the result of the multiplication operation
                System.out.printf("Result %d %s %d = %d", (int) num_1, operator, (int) num_2,(int) multiplication);
            }
            // If the operator is division
            case '/' -> {
                // Check for division by zero
                if (num_1 == 0 || num_2 == 0) {
                    // Display an error message for division by zero
                    System.out.println("Error: Cannot divide by 0");
                    break;
                }
                // Perform division using the Operators class
                double division = operators.division(num_1, num_2);
                // Print the result of the division operation
                System.out.println("Result: " + num_1 + " " + operator + " " + num_2 + " = " + division);
            }
            // If the entered operator is not valid
       
        }
    }
    static class Operators {

        //creating addition method
         double addition(double a, double b) {
            return (a + b);
        }

        //creating addition method
         double subtraction(double a, double b) {
            return (a + b);
        }

        //creating multiplication method
         double multiplication(double a, double b) {
            return (a + b);
        }

        //creating division method
         double division(double a, double b) {
            return (a / b);
        }
    }
    }
