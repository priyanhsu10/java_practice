package basics;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter 2 number ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int hcf=1;
        int c=2;
        int g=  a>b?a:b;
        while ( c<g/2){

           if(a%c==0 && b%c==0){
               if(c>hcf){
                   hcf=c;
               }
           }
           c+=1;


        }
        System.out.println(hcf);
    }
}
