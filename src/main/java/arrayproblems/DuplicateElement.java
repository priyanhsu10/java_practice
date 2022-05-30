package arrayproblems;

import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {
        //input :{1,5,4,2,1,4,7}
        //output:{1,4}
        int[] input= {1,5,4,2,1,4,7};
        List<Integer> result=new LinkedList<>();
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<input.length;i++){
            if(set.contains(input[i]))
            {
                result.add(input[i]);
            }
            else{
                set.add(input[i]);
            }

        }
        System.out.println(result);




    }
}
