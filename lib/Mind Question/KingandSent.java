//checkbox question 


import java.util.*;
public class KingandSent{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of box at which you want to know grain value");
        int n = sc.nextInt();
        long res = 1;

        if(n==1)
        res =1;
        else if(n==2){
            res = 2;
        }else{
            for(int i=1; i<=n; i++){
                res = (res*2)-1;
        }
    }
        System.out.println("This is the result "+res);
    }   
}