package basics;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of a");

        int a= sc.nextInt();
        System.out.println("Enter value ofb");
        int b= sc.nextInt();
//        addWithoutThird(a, b);
        addUsingXOR(a,b);

    }

    private static void addWithoutThird(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swap a="+ a +" and b="+ b);
    }
    private  static  void addUsingXOR(int a, int b){

        a=a^b;
        System.out.println(a);
        b=a^b;
        System.out.println(b);
        a=a^b;
        System.out.println(a);
    }

}
