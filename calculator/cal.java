package calculator;

import java.util.Scanner;

public class cal {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int res=0;
       while(true)
       {
        System.out.println("Enter the operation +,-,*,/ anf for exit press x");

        char ch=in.next().trim().charAt(0);

            if(ch=='+' || ch=='-' ||ch=='*' || ch=='/')
            {
            
                System.out.println("Enter two numbers");
                int num1=in.nextInt();
                int num2=in.nextInt();

                if(ch=='+')
                {
                    res=num1+num2;
                }
                if(ch=='-')
                {
                    res=num1-num2;
                }
                if(ch=='*')
                {
                    res=num1*num2;
                }
                if(ch=='/')
                {  if(num2!=0){
                    res=num1/num2;}
                }
              

            }
            else if(ch=='x' || ch=='X')
            {
                break;
            }
            else{
                System.out.println("Invalid Operation");
            }
            System.out.println(res);
        
       } 
       

    }
}
