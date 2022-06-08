package arrayproblems;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] a= {5,1,3,5,2,5,2,1,5,7};
        HashMap<Integer, Integer> map= new HashMap<>();
       int j=0;
        for(int i=0;i<a.length;i++){
           if(map.containsKey(a[i])){
              continue;
           }
           else {

               a[j] =a[i];
               j++;
               map.put(a[i],i);
           }
        }
   for (int i=0;i<j;i++){
       System.out.println(a[i]);
   }
    }
}
