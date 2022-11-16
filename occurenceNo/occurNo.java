package occurenceNo;

import java.util.Scanner;

public class occurNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        System.out.println("enter the element that you find the occurence in the digit");
        int d=in.nextInt();
        int count=0;
        while(n!=0)
        {   
            
            int rem=n%10;
            n=n/10;
            if(rem==d)
            {
                count++;
            }
        
        }
        System.out.println("the no of digit "+ d +" that occur repeat  is " + count);
       

    }
}
