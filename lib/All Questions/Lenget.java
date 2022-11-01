import java.util.*;
public class Lenget {
    public static void main(String args []){
        System.out.println("Enter the Lenget and Breadth of rectangle");
        Scanner rectangle = new Scanner(System.in);
        double breadth = rectangle.nextInt();
        double length = rectangle.nextInt();
        double area = length* breadth;
        System.out.println("The area of rectangle is " + area);
        double perimeter = 2*(length*breadth);
        System.out.println("The Perimeter of the rectangle is "+ perimeter);
        System.out.println("Enter the radius of circle");
        Scanner circle = new Scanner(System.in);
        double radius= circle.nextInt();
        double areacir = (22/7)*radius*radius;
        System.out.println("Area of the circle is "+ areacir);
        double circum = 2*(22/7)*radius;
        System.out.println("Circumference of the circle is "+ circum);
    }   
}
