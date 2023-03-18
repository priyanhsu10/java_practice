package basics;

public class TreeProblems {
    public static void main(String[] args) {
        //https://leetcode.com/problems/evaluate-boolean-binary-tree/
        //boolean tree
        //create tree
        //[2,1,3,null,null,0,1]
        //call

        /////////////
        //merge tree problem
        //https://leetcode.com/problems/merge-two-binary-trees/submissions/
//    tree1    [1,3,2,5]
//tree2 [2,1,3,null,4,null,7]


    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean evaluateTree(TreeNode root) {

        if (root == null) {
            return false;
        }

        //leaf node case
        if (root.left == null && root.right == null) {
            return root.val > 0;
        }

        //or caese
        if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);

        }
        //and case 
        if (root.val == 3) {

            return evaluateTree(root.left) && evaluateTree(root.right);
        }
        return false;
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        //case 1 :root ==null
        if (root1 == null && root2 == null) {
            return null;
        }
        if (root1 == null && root2 != null) {
            return root2;
        }
        if (root1 != null && root2 == null) {
            return root1;
        }
        //data add
        root1.val = root1.val + root2.val;

        //node add
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }
}
