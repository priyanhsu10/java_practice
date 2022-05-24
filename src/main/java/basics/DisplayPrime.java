package basics;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
        int number= 7;//sc.nextInt();

        for(int i=2;i <= number;i++){
          if(isPrme(i)){
            System.out.println(i);
          }
        }
    }
    public  static  boolean isPrme(int n){
        boolean prime=true;
        if(n==2){
            return  true;
        }
        for(int j=2;j<=n/2;j++){
            if(n%j==0){
                return  false;
            }


        }
        return  true;
    }
}
