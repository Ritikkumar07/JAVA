class Main {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;  // risky
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Program ended.");
        }
    }
}
