import java.util.Scanner;
public class simplebank{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            double balance = 1000.0;
            boolean running = true;
            System.out.println("Welcome to Simple Bank!");

            while (running) {
                System.out.println("Please choose an option:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1 ->
                        System.out.println("Your current balance is: $" + balance);
                    case 2 -> {
                        System.out.print("Enter amount to deposit: $");
                        double depositAmount = sc.nextDouble();
                        if (depositAmount > 0) {
                            balance += depositAmount;
                            System.out.println("Successfully deposited $" + depositAmount);
                        } else {
                            System.out.println("Invalid deposit amount.");
                        }
                    }
                    case 3 -> {
                        System.out.print("Enter amount to withdraw: $");
                        double withdrawAmount = sc.nextDouble();
                        if (withdrawAmount > 0 && withdrawAmount <= balance) {
                            balance -= withdrawAmount;
                            System.out.println("Successfully withdrew $" + withdrawAmount);
                        } else {
                            System.out.println("Invalid withdrawal amount or insufficient funds.");
                        }
                    }
                    case 4 -> {
                        running = false;
                        System.out.println("Thank you for using Simple Bank. Goodbye!");
                    }
                    default ->
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}