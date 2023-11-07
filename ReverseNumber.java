package Com.Demo;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        while(n!=0){
            int d=n%10;
            temp=temp*10+d;
           n=n/10;
        }

        System.out.println("Reverse a number"+temp);
    }
}
