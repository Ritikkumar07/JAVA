abstract class Shape {  // Abstract class
    abstract void draw(); // Abstract method
}

class Circle extends Shape { // Concrete class
    void draw() { // Implementing the abstract method
        System.out.println("Drawing a Circle");
    }
}
class Square extends Shape { // Concrete class
    void draw() { // Implementing the abstract method
        System.out.println("Drawing a Square");
    }
}
class AbstractDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(); // Creating an instance of Circle
        Shape square = new Square(); // Creating an instance of Square
        
        circle.draw(); // Calling the draw method on Circle
        square.draw(); // Calling the draw method on Square
    }
}
// Output:
// Drawing a Circle
// Drawing a Square
