package arrayproblems;

public class MaxWaterContainer {
    public static void main(String[] args) {
        var solution = new Solution();
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution.maxArea(input));

    }
}

class Solution {
    public int maxArea(int[] height) {


        return getMaxArea(height.length-1,height);
    }

    public int getMaxArea(int width, int[] height) {

        if (width < 0) {
            return 0;
        }
        int maxarea = 0;
        for (int i = 0; i < height.length; i++) {
            var tt = getMaxArea(width - 1, height);
            var current = width * height[i];
            if (current > tt) {

            maxarea = current;

            }  else{
                maxarea = tt;
            }
    }
        return maxarea;
    }
}
