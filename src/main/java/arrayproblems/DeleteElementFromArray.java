package arrayproblems;

import java.util.Arrays;

public class DeleteElementFromArray {

    public static void main(String[] args) {
        int[] input ={1,3,4,5,6,7};
        // position 2 output {1,3,5,6,7}
        int pos=2;
        for(int i=pos-1;i<(input.length-1);i++){
            input[i]=input[i+1];
        }
       Arrays.stream(input).asLongStream().forEach(x-> System.out.println(x));
    }

}
