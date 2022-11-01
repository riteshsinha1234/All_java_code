import java.util.*;
public class ReverseTheNumber {
    public static void main(String []args){
        System.out.println("Enter the 5 numbers");
        Scanner inputs = new Scanner(System.in);
        int number = inputs.nextInt();
        int v1 = number%10;//12345
    number = number/10;
        int v2 = number%10;//1234
        number = number/10;
        int v3 = number%10;//123
        number = number/10;
        int v4 = number%10;//12
        number = number/10;
        int v5 = number%10;//1
        number = number/10;
        int result = (v1*10000)+(v2*1000)+(v3*100)+(v4*10)+(v5*1);
        System.out.println("The reverse value is "+ result);
        
    }
}
