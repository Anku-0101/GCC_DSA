import java.util.LinkedList;
import java.util.Queue;


class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


class TreeTraversal {
    // CREATE AN INSTANCE for ROOT of Binary tree
    Node root;

    public TreeTraversal() {
        root = null;
    }

    // Given a binary tree, print its nodes in inorder
    void Inorder(Node node){
        if(node == null){
            return;
        }

        /* first recur on left child */
        Inorder(node.left);
        
        /* then print the data of node */
        System.out.print(node.data + " ");

        /* now recur on right child */
        Inorder(node.right);
    }

    // Given a binary tree, print its nodes in preorder, Root , Left, Right
    void Preorder(Node node){
        if (node == null)
            return;
 
        /* first print data of node */
        System.out.print(node.data + " ");
 
        /* then recur on left subtree */
        Preorder(node.left);
 
        /* now recur on right subtree */
        Preorder(node.right);
    }

    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */ 
      // Left , Right, Root
    void Postorder(Node node)
    {
        if (node == null)
            return;
 
        // first recur on left subtree
        Postorder(node.left);
 
        // then recur on right subtree
        Postorder(node.right);
 
        // now deal with the node
        System.out.print(node.data + " ");
    }


    // Here we are using an extra memory in Queue to do our traversal 
    void Levelorder(Node node){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        
        while (!queue.isEmpty()) {
 
            Node tempNode = queue.peek();
            queue.remove();
            System.out.print(tempNode.data + " ");
            
            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
 
            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    // It is doing recursively without any extra data structure to store values
    boolean LevelorderRecursive(Node node, int level){
        if(node == null)
            return false;
        
        if(level == 1){
            System.out.print(node.data + " ");
            return true;
        }

        boolean left = LevelorderRecursive(node.left, level-1);
        boolean right = LevelorderRecursive(node.right, level-1);

        return left || right;

    }

    void PrintLevelOrderWithoutQueue(Node node){
        int level = 1 ; // Starting from level 1

        while(LevelorderRecursive(node, level)){
            level++;
        }
    }

    public static void main(String args[]){
        TreeTraversal traverse = new TreeTraversal(); 
        
        // Constructing the tree
        traverse.root               = new Node(1);
        traverse.root.left          = new Node(2);
        traverse.root.right         = new Node(3);
        traverse.root.left.left     = new Node(4);
        traverse.root.left.right    = new Node(5);

        System.out.println(
            "\nInorder traversal of binary tree is ");
        traverse.Inorder(traverse.root);
        System.out.println('\n');

        System.out.println(
            "Preorder traversal of binary tree is ");
        traverse.Preorder(traverse.root);
        System.out.println('\n');
 
        System.out.println(
            "\nPostorder traversal of binary tree is ");
        traverse.Postorder(traverse.root);
        System.out.println('\n');

        System.out.println(
            "\nLevel Order traversal of binary tree is ");
        traverse.Levelorder(traverse.root);
        System.out.println('\n');

        System.out.println(
            "\nLevel Order traversal of binary tree without Queue ");
        traverse.PrintLevelOrderWithoutQueue(traverse.root);
        System.out.println('\n');
    }
}
