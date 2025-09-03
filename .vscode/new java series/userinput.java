
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.next();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.print("Enter your marks: ");
            float marks = sc.nextFloat();

            System.out.print("Your name is: " + name + ", you are " + age + " years old, and your marks are " + marks + " percent.");
        }
    }

}
