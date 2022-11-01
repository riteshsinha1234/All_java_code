import java.util.*;

public class EvenAndOdd {
    public static void main(String args[]){
        System.out.println("Enter your Input");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input%2 ==0){
            System.out.println("This is an even input "+input);
        }else if(input%2!=0){
            System.out.println("This input is odd "+ input);
        }else{
            System.out.println("This is invalid");
        }
    }
}
