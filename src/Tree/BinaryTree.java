package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static class Node{
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data)
        {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    static class BinaryTreeBuild{
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index] == -1)
            {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.leftNode = buildTree(nodes);
            newNode.rightNode = buildTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root)
        {
            if(root == null)
            {
                return;
            }
            System.out.println(root.data);
            preOrder(root.leftNode);
            preOrder(root.rightNode);
        }

        public static void inOrder(Node root)
        {
            if(root == null)
            {
                return;
            }
            inOrder(root.leftNode);
            System.out.println(root.data);
            inOrder(root.rightNode);
        }

        public static void postOrder(Node root)
        {
            if(root == null)
                return;
            postOrder(root.leftNode);
            preOrder(root.rightNode);
            System.out.println(root.data);
        }

        public static void levelOrder(Node root)
        {
            if(root == null)
            {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty())
            {
                Node currNode = q.remove();
                if(currNode == null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+ " ");
                    if(currNode.leftNode != null)
                    {
                        q.add(currNode.leftNode);
                    }
                    if(currNode.rightNode != null)
                    {
                        q.add(currNode.rightNode);
                    }
                }
            }
        }

        public static int countOfNodes(Node root)
        {
            if(root == null)
            {
                return 0;
            }
            int leftnode = countOfNodes(root.leftNode);
            int rightNode = countOfNodes(root.rightNode);
            return leftnode + rightNode + 1;
        }

        public static int sumOfNodes(Node root)
        {
            if(root == null)
            {
                return 0;
            }

            int leftSum = sumOfNodes(root.leftNode);
            int rightSum = sumOfNodes(root.rightNode);
            return leftSum + rightSum + root.data;
        }

        public static int heightOfTree(Node root)
        {
            if(root == null)
                return 0;
            int heightOfLeft = heightOfTree(root.leftNode);
            int heightOfRight = heightOfTree(root.rightNode);
            return Math.max(heightOfRight,heightOfLeft) + 1;
        }
    }
    public static  void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeBuild tree = new BinaryTreeBuild();
        Node root = tree.buildTree(nodes);
        System.out.println("Root data:- "+root.data);
       // tree.preOrder(root);
      //  tree.inOrder(root);
      // tree.postOrder(root);
     //   tree.levelOrder(root);
        System.out.println("Count of Node in tree:- "+ tree.countOfNodes(root));
        System.out.println("Count of Sum in tree:- "+ tree.sumOfNodes(root));
        System.out.println("Height of tree:- "+ tree.heightOfTree(root));
    }
}
