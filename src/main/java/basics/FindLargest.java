package basics;

import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 3 number");
        int[] a= new int[3];
        for(int i =0;i<3;i++){
            a[i]=sc.nextInt();
        }
       int largest=0;
        for(int i =0;i<3;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println("largest="+largest);

    }
}
