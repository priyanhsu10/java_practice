package arrayproblems;

public class FindPairOfSumInArray {
//array are in sarted
    public static void main(String[] args) {
     int [] input = {1,2,3,4,5,6,7};
     int sum= 9;
     //output =[{2,7},{3,6},{4,5}]
     int low=0;
     int high= input.length-1;
 int cout =0;
     while (low<high){

         if(sum==input[low]+input[high]){
             System.out.println("{"+input[low]+","+input[high]+"}");
             low=0;
             high-=1;
         }

         low+=1;
         cout+=1;
     }
        System.out.println(cout);
    }
}
