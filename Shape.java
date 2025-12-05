public class Shape {
    
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(7, 6 );
        Shape square = new Square(5);
        Shape circle = new Circle(3);

        System.out.println(" Lice na pravougulnik: " + rectangle.calculateArea());
        System.out.println("Perimetera e: " + rectangle.calculatePerimeter());

        System.out.println("Liceto e: " + square.calculateArea);
        System.out.println("Perimetera e: " + square.calculatePerimeter);

        System.out.println("Liceto e: " + circle.calculateArea);
        System.out.println("Perimetera e: " + circle.calculatePerimeter);

    }

    abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
    }
    class Rectangle extends Shape{
        private double width;
        private double height;

        public Rectangle(double width, double height);

        this.width = width;
        this.height = height;

      
    }
        
    double calculateArea(){
        return width * height;

    }

    double calculatePerimeter(){
        return 2 * (width + height);
    }


    
}


