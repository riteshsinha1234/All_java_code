import java.util.*;
public class Distance {
    public static void main(String args []){
        System.out.println("Enter your Value");
        Scanner Kilo = new Scanner(System.in);
        double meter = 1000*Kilo.nextInt();
        System.out.println("Value in meter "+ meter);
        double centimeter = meter*100;
        System.out.println("Value is centimeter is : "+ centimeter); 
        

    };

}
