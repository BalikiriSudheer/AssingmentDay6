package Com.Demo;

import java.util.Scanner;

public class Fibannci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int firstterm=0;
         int secondterm=1;
        System.out.println("fibannaci series"+n+"terms");

        for(int i=1;i<=n;i++){
            System.out.println(firstterm);
            int nextterm=firstterm+secondterm;
            firstterm=secondterm;
            secondterm=nextterm;
        }
    }
}
