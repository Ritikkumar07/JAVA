public class ControlStatements {
    public static void main(String[] args) {
        // If-Else Statement
        int marks = 80;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        // Switch Statement
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid day");
        }

        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop
        System.out.println("While Loop:");
        int j = 2;
        while (j <= 50) 
        {
            if(j%2==0)
        {
            System.out.println("Iteration: " + j);
        }
            j++;
        }

        // Do-While Loop
        System.out.println("Do-While Loop:");
        int k = 1;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k <= 10);


        //breakdemo
        System.out.println("Break Statement Demo:");
        int l = 1;
        while (l <= 10) {
            if (l == 5) {
                break;
            }
            System.out.println("Iteration: " + l);
            l++;
        }

        // continue demo
        System.out.println("Continue Statement Demo:");
        int m = 0;
        while (m < 10) {
            m++;
            if (m == 5) {
                continue;
            }
            System.out.println("Iteration: " + m);
        }

        //return demo
        System.out.println("Return Statement Demo:");
        int result = sum(5, 10);
        System.out.println("Sum: " + result);
    }

    static int sum(int a, int b) {
        return a + b;
    }
    
}
