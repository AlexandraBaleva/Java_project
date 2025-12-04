public class Rectangle {
    double width;
    double height; 
     public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();
        myRectangle.width = 7.2;
        myRectangle.height = 6.6;
     }

     public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
     }

     public void calculateArea( width * height){
    
        System.out.println("Liceto e: " + calculateArea());
     }

     public void calculatePerimeter(width+height){
        System.out.println("Perimetyra e: " + calculatePerimeter());
     }
}
