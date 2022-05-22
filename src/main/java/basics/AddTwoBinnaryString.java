package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.LogManager;
import java.util.stream.Collectors;

public class AddTwoBinnaryString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first binary number:");
        String a=sc.next();
        String b= sc.next();
        addNumber(a,b);

    }

    private static void addNumber(String a,String b) {
       int al= a.length()-1;
       int lb= b.length()-1;
       int cary=0;
       String result="";
       while ( al>-1 || lb>-1){

           int c1= (al >= 0) ? ((a.charAt(al) == '0') ? 0 : 1) : 0;
           int c2= (lb >= 0) ? ((b.charAt(lb) == '0') ? 0 : 1) : 0;
           int bitresult=c1+c2+cary;
           int br=0;
           if(bitresult==2){
              br=0;
              cary=1;
           }else if(bitresult==3){
               br=1;
               cary=1;
           }
           else {
               cary=0;
           }
          System.out.println(c1+"+"+c2 + "+"+cary +"="+br);
           result=br+result;


           al-=1;
           lb-=1;

       }
if(cary==1){
    result=cary+result;
    System.out.println("cary="+cary);
}
        System.out.println(result);
    }

}
