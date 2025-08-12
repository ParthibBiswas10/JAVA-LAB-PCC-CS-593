// Runtime Polymorphism Example

class Figure {
    double dim1, dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    
    double area() {
        System.out.println("Area for Figure is not defined");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    
    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    
    double area() {
        return (dim1 * dim2) / 2;
    }
}

public class q5{
    public static void main(String[] args) {
        Figure f; 

        f = new Rectangle(10, 5); 
        System.out.println("Area of Rectangle: " + f.area());

        f = new Triangle(10, 5);
        System.out.println("Area of Triangle: " + f.area());
    }
}
