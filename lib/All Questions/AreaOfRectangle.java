import java.util.*;
public class AreaOfRectangle {
    public static void main (String args []){
        System.out.println("Enter the input of triangle");
        Scanner input = new Scanner(System.in);
        double breadth = input.nextInt();
        double height = input.nextInt();
        double area = .5*breadth*height;
        System.out.println("The area of the triangle is "+ area);
    }
}
