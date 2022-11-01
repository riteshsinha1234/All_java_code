import java.security.Principal;
import java.util.*;
public class Temperature {
    public static void main(String args []){
        System.out.println("Enter your Fahrenheit degree");
        Scanner temp = new Scanner(System.in);
        double Faren = temp.nextInt(); 
        double centi = (Faren - 32)*5/9;
        System.out.println("The centigrate temp is "+ centi);
    }
}
