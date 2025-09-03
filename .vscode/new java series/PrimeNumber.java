import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
         int num = sc.nextInt();
         boolean isprime = true; // Assume the number is prime

         if(num <=1){
            isprime = false; // Numbers less than or equal to 1 are not prime
         }
            else{
                for(int i = 2; i<=num/2; i++){
                    if(num % i == 0){
                        isprime = false; // Found a divisor, not prime
                        break;
                    }
                }
            }
            if(isprime){
                System.out.println(num + " is a prime number.");
            }
            else{
                System.out.println(num + " is not a prime number.");
            }
           }

         }


