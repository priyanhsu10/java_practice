package arrayproblems;

import java.util.Arrays;

public class SegregateZerosAndOne {
    public static void main(String[] args) {
        int [] a= {1,0,1,0,0,1,0,0};
        //time complexity should be O(n)

        int j=0;
        int next=0;

      for (int i=0;i<a.length;i++){
          if(a[i]==0){
              a[j++]=0;
          }
      }
      while (j<a.length){
          a[j++]=1;
      }
        Arrays.stream(a).asLongStream().forEach(System.out::println);
    }
}
