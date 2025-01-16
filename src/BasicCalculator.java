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

    }
}
