import java.util.*;

public class leapyear {
    public static void main(String[] args){
        System.out.println("Enter your input");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%400==0){
            System.out.println("This year is a LeapYear "+ year);
        }else if(year%100==0){
            System.out.println("This year is not a LeapYear "+ year);
        }else if (year%4==0){
            System.out.println("This yera is a LeapYear "+ year);
        }else{
            System.out.println("Invalid year");
        }
    }
}
