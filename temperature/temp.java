package temperature;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float tempc=in.nextFloat();
        float tempf= (tempc*9/5) + 32;
        System.out.println("temperature in freh "+tempf);

    }
}
