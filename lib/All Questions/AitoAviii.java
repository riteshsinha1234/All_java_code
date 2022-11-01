import java.util.*;
public class AitoAviii {
    public static void main(String args[]){
        System.out.println("Enter length and breadth");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int A0 = length*breadth;
        int A1 = A0/2;
        int A2 = A1/2;
        int A3 = A2/2;
        int A4 = A3/2;
        int A5 = A4/2;
        int A6 = A5/2;
        int A7 = A6/2;
        int A8 = A7/2;
        System.out.println("so this the value of all A0 to A8 "+" "+A0+" "+A1+" "+A2+" "+A3+" "+A4+" "+A5+" "+A6+" "+A7+" "+A8);
    }
}
