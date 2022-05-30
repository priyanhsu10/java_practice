package arrayproblems;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CommonElementIn3SortedArray {
    public static void main(String[] args) {
  int[] ar1= {1,4,5,10,20,30,40,80};
  int[] ar2={4,6,7,20,80,100};
  int [] ar3={3,4,15,20,30,70,80,120};
  //output : {20,80}
        List<Integer> r= new LinkedList<>();
        int x=ar1.length-1,y=ar2.length-1 ,z= ar3.length-1;
        while(x>=0 && y>=0 && z>=0){
            if(ar1[x]==ar2[y]&& ar2[y]==ar3[z]){
                //matching element
                r.add(ar1[x]);

                x--;
                y--;
                z--;
            }
            else if(ar1[x]>ar2[y] && ar1[x]>ar3[z]){
                x-=1;
            }
            else if(ar2[y]>ar3[z]){
                y-=1;
            } else
             {
                 z--;
             }
        }
        System.out.println(r);
    }
}
