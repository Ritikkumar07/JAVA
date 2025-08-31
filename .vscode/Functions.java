public class Functions {
    
    public static void main(String[] args) {
        // Calling the function to print a message
        printMessage("Welcome to Java Functions!");

        // Calling the function to add two numbers
        int sum = addNumbers(5, 10);
        System.out.println("Sum: " + sum);
    }

    // Function to print a message
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Function to add two numbers and return the result
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
