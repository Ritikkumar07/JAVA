import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            //input the number
            System.out.print("enter the number:");
        int number = sc.nextInt();

        int reversed = 0; //to store the reversed number
        int original = number; //to store the original number

        // loop until the number becomes 0
        while(number != 0){
            int digit = number % 10; // get the last digit
            reversed = reversed * 10 + digit; // append the digit
            number = number / 10;
        }

        // check if the original number is equal to the reversed number
        if(original == reversed){
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
        }
    }
}
