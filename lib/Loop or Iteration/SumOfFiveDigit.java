import java.util.*;
public class SumOfFiveDigit {
    public static void main(String args[]){
        System.out.println("Enter the 5 digit number");
        Scanner sc = new Scanner(System.in);
        int munna = sc.nextInt();
        int sum = 0;

        while(munna!=0){
            sum +=munna%10;
            munna = munna/10;
        }
        System.out.println("The sum of 5 digit number is:"+sum);
    }
}
