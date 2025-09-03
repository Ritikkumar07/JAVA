

public class operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 20;
        System.out.println("Arithmetic Operators----------------------------");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Assignment Operators
        int c = 30;
        c += a; // c = c + a
        System.out.println("Assignment Operators----------------------------");
        System.out.println("Addition Assignment: " + c);
        c -= a; // c = c - a
        System.out.println("Subtraction Assignment: " + c);
        c *= a; // c = c * a
        System.out.println("Multiplication Assignment: " + c);
        c /= a; // c = c / a
        System.out.println("Division Assignment: " + c);
        c %= a; // c = c % a
        System.out.println("Modulus Assignment: " + c);

        // Unary Operators
        int d = 5;
        System.out.println("Unary Operators----------------------------");
        System.out.println("Unary Plus: " + (+d));
        System.out.println("Unary Minus: " + (-d));

        // Relational Operators
        System.out.println("Relational Operators----------------------------");
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not Equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or Equal to: " + (a >= b));
        System.out.println("Less than or Equal to: " + (a <= b));


        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical Operators----------------------------");
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator: " + max);

        // Bitwise Operators
        System.out.println("Bitwise Operators----------------------------");
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Bitwise Complement: " + (~a));
        System.out.println("Left Shift: " + (a << 2));
        System.out.println("Right Shift: " + (a >> 2));

        // Instanceof Operator
        String str = "Hello";
        System.out.println("Is String: " + (str instanceof String));

        // Shift Operators
        int e = 8; // Binary: 1000
        System.out.println("Shift Operators----------------------------");
        System.out.println("Left Shift: " + (e << 2)); // 32 (Binary: 100000)
        System.out.println("Right Shift: " + (e >> 2)); // 2 (Binary: 10)
    }
}
