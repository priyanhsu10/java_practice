package basics;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean found= false;
        int  lcm=0;
        int c=2;
       while(!found){
           lcm=a*c;
           if(lcm*c%b==0){
               found=true;
           }

           c+=1;
       }
        System.out.println("LCM of "+a+" and " +b+"="+lcm);
    }
}
