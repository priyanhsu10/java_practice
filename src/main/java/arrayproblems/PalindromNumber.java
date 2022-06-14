package arrayproblems;

public class PalindromNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
    }
    public static boolean isPalindrome(int x) {

        char[] s= String.valueOf(x).toCharArray();
        int back=s.length-1;
        if(s.length==2){
            if(s[0]==s[1]){
                return true;
            }
            return false;
        }
        for(int i =0;i<s.length;i++){

            if(s[i]!=s[back]){
                return false;
            }
            if(i>back){
                return true;
            }
            back--;

        }
        return false;

    }
}
