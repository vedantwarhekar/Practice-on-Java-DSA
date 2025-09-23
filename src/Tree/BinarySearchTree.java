package Tree;

import java.util.ArrayList;

public class BinarySearchTree {
    static class Node{
        int data;
        Node rightNode;
        Node leftNode;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static Node insterIntoTree(Node root, int value){
        if(root == null)
        {
            root = new  Node(value);
            return root;
        }
        if(root.data > value)
        {
            root.leftNode = insterIntoTree(root.leftNode,value);
        }else {
            root.rightNode = insterIntoTree(root.rightNode,value);
        }
        return root;
    }

    public static void inOrder(Node root)
    {
        if(root == null)
            return;

        inOrder(root.leftNode);
        System.out.print(root.data+" ");
        inOrder(root.rightNode);
    }

    public static boolean search(Node root , int key){
        if(root == null) {
            return false;
        }
        if(root.data == key)
        {
            return  true;
        } else if (root.data > key) {
           return search(root.leftNode, key);
        }else {
           return search(root.rightNode,key);
        }
    }

    public static  Node delete(Node root, int key)
    {
        if(root.data > key)
        {
            root.leftNode = delete(root.leftNode,key);
        }else if(root.data < key) {
            root.rightNode = delete(root.rightNode,key);
        }else {
            // root.data == null
            //case 1 no child
            if (root.leftNode == null && root.rightNode == null) {
                return null;
            }

            //case 2 with one node
            if (root.leftNode == null) {
                return root.rightNode;
            } else if (root.rightNode == null) {
                return root.leftNode;
            }

            //case3 with two node(need to find successor
            Node inorderSuccessor = inOrderSuccessor(root.rightNode);
            root.data = inorderSuccessor.data;
            root.rightNode = delete(root.rightNode, inorderSuccessor.data);
        }
        return root;
    }
    public static Node inOrderSuccessor(Node root)
    {
     while (root.leftNode != null)
     {
         root = root.leftNode;
     }
     return root;
    }

    public static void printInRange(Node root,int X, int Y)
    {
       if(root == null)
           return;
       if(root.data >= X && root.data <=Y)
       {
           printInRange(root.leftNode,X,Y);
           System.out.print(root.data+" ");
           printInRange(root.rightNode,X,Y);
       } else if (root.data >= Y) {
           printInRange(root.leftNode,X,Y);
       }else {
           printInRange(root.rightNode,X,Y);
       }
    }

    public static void printPath(ArrayList<Integer> path)
    {
        for(int i = 0; i < path.size(); i++)
        {
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path)
    {
        if(root == null)
            return;
        path.add(root.data);

        //leaf
        if(root.leftNode == null && root.rightNode == null)
        {
            printPath(path);
        }else {
            printRoot2Leaf(root.leftNode,path);
            printRoot2Leaf(root.rightNode,path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args)
    {
        int values[] = {8,5,10,3,6,11,14};
        Node root = null;
        for(int i = 0; i < values.length; i++)
        {
            root = insterIntoTree(root,values[i]);
        }
        //inOrder(root);
//        System.out.println();
//        System.out.println( search(root,6));
      //  delete(root,5);
       // System.out.println();
       // inOrder(root);
        // printInRange(root,3,7);
        printRoot2Leaf(root,new ArrayList<>());
    }
}
