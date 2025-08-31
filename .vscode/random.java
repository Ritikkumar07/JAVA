
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        // System.out.println((int)(Math.random()*100));

        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your name=");
         String name= sc.next();  // for one word
       // String name= sc.nextLine();  // for sentecne
        System.out.println(name);
    }
}
