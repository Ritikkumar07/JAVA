
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {

           //input the number
           System.out.print("enter the number: ");
           int number = sc.nextInt();

           int reversed = 0; //to store the number 

           // loop until the number becomes 0
           while(number != 0){
            int digit = number % 10; // get the last digit
            reversed = reversed * 10 + digit; // append the digit
            number = number / 10;
           }
           System.out.println("Reversed number is:"+reversed);
       }
    }
}



//__________________________ Explanation (Step-by-Step):________________________________

//  Start:
// number = 1234, reversed = 0.

// First loop:

// digit = 1234 % 10 = 4 → last digit nikala.

// reversed = 0*10+4 = 4 → reversed me add kiya.

// number = 1234/10 = 123 → last digit hata diya.

// Second loop:

// digit = 123 % 10 = 3.

// reversed = 4*10+3 = 43.

// number = 123/10 = 12.

// Third loop:

// digit = 12 % 10 = 2.

// reversed = 43*10+2 = 432.

// number = 12/10 = 1.

// Fourth loop:

// digit = 1 % 10 = 1.

// reversed = 432*10+1 = 4321.

// number = 1/10 = 0 → Loop khatam.

// Output: Reversed Number = 4321.

// 💡 Easy Trick to Remember:

// % 10 → last digit uthao.

// / 10 → last digit hatao.

// *10 + digit → number ko ulta banate jao.