import java.util.*;
public class Voting{
    public static void main(String args[]){
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You can vote");
        }else if(age>3&&age<18){
            System.out.println("You cannot vote");
        }else if(age<0){
            System.out.println("invalid input");
        }
    }
}