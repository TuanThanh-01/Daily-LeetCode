package tree;

import java.util.ArrayList;
import java.util.List;

public class MyBST {

    public TreeNode mRoot;

    public MyBST() {

    }
    // leetcode 701
    public TreeNode insert(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);
        // TH1: root == null
        if(root == null) {
            root = new TreeNode(value) ;
            return root;
        } else {
            TreeNode temp = root;
            while (true) {
                if(value > temp.val) {
                    if(temp.right == null) {
                        temp.right = newNode;
                        break;
                    }
                    else {
                        temp = temp.right;
                    }
                } else{ // value < temp.val
                    if(temp.left == null) {
                        temp.left = newNode;
                        break;
                    }
                    else {
                        temp = temp.left;
                    }
                }
            }
            return root;
        }
    }

    // them value vao rootNode tree
    public TreeNode insertIntoBST(TreeNode rootNode, int value) {
        if(rootNode == null) {
            return new TreeNode(value);
        }

        if(value < rootNode.val) {
            if(rootNode.left == null) {
                rootNode.left = new TreeNode(value);
            }
            else {
                insertIntoBST(rootNode.left, value);
            }
        }
        else {
            if(rootNode.right == null) {
                rootNode.right = new TreeNode(value);
            }
            else {
                insertIntoBST(rootNode.right, value);
            }
        }
        return rootNode;
    }

    // tim node con trai cung root
    public TreeNode findLeftModeNode(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode leftMostNode = root;
        while (leftMostNode.left != null) {
            leftMostNode = leftMostNode.left;
        }
        return leftMostNode;
    }

    // leetcode 450
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) {
            return null;
        }

        // B1: Tim nut xoa
        if(key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.val){
            root.right = deleteNode(root.right, key);
        } else {
            // B2: Xoa node root

            // Th1: root la node la
            if(root.left == null && root.right == null) {
                return null;
            }

            // Th2: chi co 1 con ben trai
            if(root.left != null && root.right == null) {
                return root.left;
            }

            // Th2: chi co 1 con ben phai
            if(root.left == null && root.right != null ) {
                return root.right;
            }

            // Th3: ton tai 2 con
            // Tim not trai cung cay con ben phai
            TreeNode leftMostNode = findLeftModeNode(root.right);
            root.val = leftMostNode.val;
            root.right = deleteNode(root.right, leftMostNode.val);
        }

        return root;
    }

    public TreeNode searchBST(TreeNode root, int key) {

        if(root == null) {
            return null;
        }

        if(key < root.val) {
            return searchBST(root.left, key);
        }
        else if(key > root.val) {
            return searchBST(root.right, key);
        }
        else {
            return root;
        }
    }

    // Node - L - R
    public static void preOrder(TreeNode currentNode) {
        if(currentNode == null) return;
        // duyet currentNode truoc
        System.out.print(currentNode.val + " ");

        // duyet ben trai | duyet ben phai
        preOrder(currentNode.left);
        preOrder(currentNode.right);
    }

    // L - Node - R
    public static void inOrder(TreeNode currentNode) {
        if(currentNode == null) return;
        // duyet ben trai
        inOrder(currentNode.left);

        // duyet currentNode
        System.out.print(currentNode.val + " ");

        // duyet ben phai
        inOrder(currentNode.right);
    }

    // L - R - Node
    public static void postOrder(TreeNode currentNode) {
        if(currentNode == null) return;
        // duyet ben trai
        postOrder(currentNode.left);

        // duyet ben phai
        postOrder(currentNode.right);

        // duyet currentNode truoc
        System.out.print(currentNode.val + " ");
    }

    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode currentNode) {
        if(currentNode == null) return result;
        // duyet currentNode truoc
        result.add(currentNode.val);

        // duyet ben trai | duyet ben phai
        preorderTraversal(currentNode.left);
        preorderTraversal(currentNode.right);

        return result;
    }
}
