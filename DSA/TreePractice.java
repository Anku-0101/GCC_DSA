import java.util.*;

class Main{
    public static void main(String[] args){
        /*
                1
                /\
               2  3
              /\  /\
             4 5  6 7
        */ 
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.inorder(tree.root);

        System.out.println("depth = " + tree.getDepth(tree.root));
        tree.printLevelOrder(tree.root);
        System.out.println("printing level order using queue");
        tree.levelOrderQueue(tree.root);
    }
}

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        left=right = null;
    }
}

class BinaryTree{
    Node root;

    void levelOrderQueue(Node root){
        System.out.println("root = " + root.data);
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node node1 = q.peek();
        
        
        while(!q.isEmpty()){
            
            Node node = q.peek();
            q.remove();

            System.out.print(node.data + " ");
            if(node.left != null){
                q.add(node.left);
            }
            if(node.right != null){
                q.add(node.right);
            }
        }
    }
    void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    int getDepth(Node root){
        if(root == null)
            return 0;
        
        int lheight = getDepth(root.left);
        int rHeight = getDepth(root.right);

        if(lheight > rHeight)
            return (lheight +1);
        
        return (rHeight+1);
    }

    void printNodeAtCurrentLevel(Node root, int level){
        if(root == null)
            return;
        
        if(level == 1)
            System.out.println(root.data);
        
        else if(level > 1){
            printNodeAtCurrentLevel(root.left, level-1);
            printNodeAtCurrentLevel(root.right, level-1);
        }
    }

    void printLevelOrder(Node root){
        int height = getDepth(root);
        for(int i = 1; i <=height; i++)
            printNodeAtCurrentLevel(root, i);
    }
}



