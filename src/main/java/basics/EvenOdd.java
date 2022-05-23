package basics;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive number");
        boolean result= sc.nextInt()%2==0;
        if(result){
            System.out.println("even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
