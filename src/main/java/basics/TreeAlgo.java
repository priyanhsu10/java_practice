package basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class TreeAlgo {
    //bst  create
    //search
    //insert
    //delete
    //traversing
    //inorder
    //preorder
    //postorder
    //print descending order
    //level order
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            //insert node
            root = insertNode(root, values[i]);
        }
        //inOrder(root);
        // preOrder(root);
        //postOrder(root);
        // searchExample(root);
        //  levelOrder(root);
//        deleteNode(root, 5);
//        inOrder(root);
        printRootToLeaf(root,new ArrayList<Integer>());
    }

    private static void printRootToLeaf(Node root, ArrayList<Integer> path) {

    if(root==null){
        return;
    }
    path.add(root.data);
    //leaf node
    if(root.left==null && root.right==null){

        printPath(path);

    }else {
//non leaf node
        printRootToLeaf(root.left,path);
        printRootToLeaf(root.right,path);
    }
    path.remove(new Integer(root.data));
    }

    private static void printPath(ArrayList<Integer> path) {
        for (Integer integer : path) {
            System.out.print(integer+"->");

        }
        System.out.println();
    }

    private static Node deleteNode(Node root, int i) {
        if (root == null) {
            return null;
        }
        if (root.data > i) {
            root.left = deleteNode(root.left, i);
        } else if (root.data < i) {
            root.right = deleteNode(root.right, i);
        } else if (root.data == i) {
            //case 1 : node is leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            //case 2 : node having at most 1 child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //case 3 : Node having both child
            //solution : find inorder successor of node that means left most node from right subtree
            Node is= inOrderSuccessor(root.right);
            root.data= is.data;
            root.right=deleteNode(is.right,is.data);

        }
        return root;

    }

    private static Node inOrderSuccessor(Node root) {
        while (root.left != null) {
            root.left = root;
        }
        return root;
    }

    private static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root == null) {
            return;
        }
        q.add(root);
        while (!q.isEmpty()) {
            Node n = q.remove();
            if (n.left != null) {
                q.add(n.left);

            }
            if (n.right != null) {
                q.add(n.right);
            }
            System.out.print(n.data + " ");

        }

    }

    private static void searchExample(Node root) {
        if (searchNode(root, 6)) {
            System.out.println(6 + " found");
        } else {
            System.out.println(6 + " not found");
        }
        ;//true
        searchNode(root, 11); //false
        if (searchNode(root, 11)) {
            System.out.println(11 + "  found");
        } else {
            System.out.println(11 + " not found");
        }
    }

    private static boolean searchNode(Node root, int i) {
        if (root == null) {
            return false;
        }
        if (root.data > i) {
            return searchNode(root.left, i);

        } else if (root.data < i) {
            return searchNode(root.right, i);
        } else {
            return true;
        }
    }

    private static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    private static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    private static Node insertNode(Node root, int value) {
        if (root == null) {
            return new Node(value);

        }
        if (root.data > value) {
            root.left = insertNode(root.left, value);
        } else {
            root.right = insertNode(root.right, value);
        }
        return root;
    }
}
