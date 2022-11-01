import java.util.*;


public class Input{
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();//next is use to take input //nextInt(),nextfloat(),nextLine(),next()
        System.out.println("This is my name "+name);

        //The sum of two integre 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of values is "+ sum);
    }
}

