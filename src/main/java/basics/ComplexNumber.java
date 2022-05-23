package basics;

import java.util.Scanner;

public class ComplexNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the real  and imaginary parth first number");
        int r1= sc.nextInt();
        int i1 = sc.nextInt();
        System.out.println("enter the real and imaginary part of second number");
        int r2= sc.nextInt();
        int i2 = sc.nextInt();
        System.out.println("result="+(r1+r1)+"+"+(i1+i2)+"i");

    }
}
