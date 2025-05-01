package practiceOne;
import java.util.Scanner;

public class oddEvenChecker {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number (or type 'exit' to quit ): ");
            String input = scanner.next();

        if(input.equalsIgnoreCase("exit")){
        System.out.println("Bye");
        break;

        }
        int number;
        try{
            number = Integer.parseInt(input);
        }catch(NumberFormatException e){
            System.out.println("Please enter a valid number.");
            continue;
        }

    if (number % 2 == 0){
        System.out.println(number + " is even");

    } else{
        System.out.println(number + " is odd");
    }
        }
                
    }
}
