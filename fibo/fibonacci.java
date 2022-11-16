package fibo;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int a=0;
        System.out.println(a);
        int b=1;
        System.out.println(b);
        // int c=a+b;
        // System.out.println(c);

        for(int i=1;i<=n;i++){
           int c=a+b;
            a=b;
            b=c;
            
            System.out.println(c);
        }
        
    }
}
