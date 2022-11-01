import java.util.*;
public class marks {
    public static void main (String args[]){
        System.out.println("Enter the marks ");
        Scanner input = new Scanner(System.in);
        int m1 = input.nextInt();
        int m2 = input.nextInt();
        int m3 = input.nextInt();
        int m4 = input.nextInt();
        int m5 = input.nextInt();
        int sum = m1+m2+m3+m4+m5;
        System.out.println("Total marks is "+ sum);
        int avg = sum/5;
        System.out.println("Average of the total no. is " + avg);
    }
}
