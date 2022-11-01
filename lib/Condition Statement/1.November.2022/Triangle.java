import java.util.*;
public class Triangle {
    public static void main(String[] args) {
        int a ,b ,c;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b&&a>c||b>a&&b>c||c>a&&c>b){
            System.out.println("Then it is a Triangle");
        }else{
            System.err.println("not a Triangle");
        }
    }
}