/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstree;

/**
 *
 * @author KHELLO
 */
import java. util. *;
public class BSTree {

    /**
     * @param args the command line arguments
     */
    private Node root;

    public static class Node {

        Node left;

        Node right;

        Node parent;

        int data;

        Node(int newData) {

            left = null;

            right = null;

            parent = null;

            data = newData;

        }
//        Node(int data,Node parent,Node left, Node right) {
//         this.data = data;            
//         this.left = left;
//         this.right = right;
//         this.parent = parent;
//        }


    }

    public void BSTree() {

        root = null;

    }

    public void insert(int data) {

        root = insert(root, data);

    }

    private Node insert(Node node, int data) {

        if (node == null) {

            node = new Node(data);

        } else {

            if (data <= node.data) {

                node.left = insert(node.left, data);

                node.left.parent = node;

            } else {

                node.right = insert(node.right, data);

                node.right.parent = node;

            }

        }

        return (node);

    }

    public boolean lookup(int data) {

        return (lookup(root, data));

    }

    private boolean lookup(Node node, int data) {

        if (node == null) {

            return (false);

        }

        if (data == node.data) {

            return (true);

        } else if (data < node.data) {

            return (lookup(node.left, data));

        } else {

            return (lookup(node.right, data));

        }

    }

    public int root() {

        return root.data;

    }

    public void method1() {
             levelOrder(root);
        System.out.println();
    }

    private void levelOrder(Node node) {
        if (node != null) {
            Queue<Node> q = new ArrayDeque<Node>();
            q.add(node);
            while (q.size() != 0) {
                Node currentNode = q.remove();
                System.out.print(currentNode.data + " ");
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
        }
    }
    
 
        //**** Complete this method to answer Question 2.A

    public void method2(int data) {

        if (this.lookup(data)) {

            Node node = getNode(root, data);
            if (node == null) {
            return;
        }       
            
        descendantsTree(node.left);
        System.out.print(node.data + " ");
        descendantsTree(node.right);

        } else {

            System.out.print("the data is NOT exist!!");

        }

    }
       public void descendants() {
        descendantsTree(root);
        System.out.println();
    }
    
    private void descendantsTree(Node node) {
        if (node == null) {
            return;
        }
        descendantsTree(node.left);
        System.out.print(node.data + " ");
        descendantsTree(node.right);
    }             //**** Complete this method to answer Question 3.A


    private Node getNode(Node node, int data) {

        if (data == node.data) {

            return node;

        } else if (data < node.data) {

            return getNode(node.left, data);

        } else {

            return getNode(node.right, data);

        }

    }
 
}


