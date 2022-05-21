package basics;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of a");

        int a= sc.nextInt();
        System.out.println("Enter value ofb");
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap a="+a +" and b="+b);

    }
}
