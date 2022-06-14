package arrayproblems;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
  String s = "()[]{}";
        System.out.println(s);

    }
    public boolean isValid(String s) {
       char[] arr=s.toCharArray();
       int i=0, n=arr.length-1;
       Stack<Character> st= new Stack<>();
        HashMap<Character,Character> brmap= new HashMap<>();
        brmap.put('{','}');
        brmap.put('[',']');
        while(i<n){


        }


    }
}
