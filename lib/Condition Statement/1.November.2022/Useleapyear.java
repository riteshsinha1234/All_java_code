//find leapyear by using &&(and) and ||(or) operatior 
import java.util.*;
public class Useleapyear {
    public static void main(String[] args) {
        System.err.println("Enter the vlaue");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%400==0||year%100!=0&&year%4==0){
            System.out.println("This is leapyear");
        }else{
            System.out.println("Not a leapyear");
        }      
    }
}
