//first Question date (31.10.2022)
import java.util.*;
public class input_output_to_bit_manuplation{
    public static void main(String args[]){
        System.out.println("Enter your basic Salary");
        Scanner basic = new Scanner(System.in);
        double bn = basic.nextInt();
        System.out.println("Your Basic Salary is "+bn);
        double dress = .4*bn;
        System.out.println("Your Dress cost is "+ dress);
        double girlfriend = .2*bn;
        System.out.println("Your girlfriend cost is "+ girlfriend);
        double sum = bn + dress + girlfriend; 
        System.out.println("Total Salary is "+ sum);
    }
}