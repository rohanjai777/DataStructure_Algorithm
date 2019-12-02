class BST{
    
    private class Node{ 
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
        
    }
    Node root;
    public void insert(int data){
        Node node = new Node(data);
        
        if(root == null){
            root = node;
        }
        else{
            Node nextNode = root;
            while(true){
            if(node.data < nextNode.data){
                if(nextNode.left == null){
                     nextNode.left = node;
                    return;
                }
                nextNode = nextNode.left;
            }
            else if(node.data > nextNode.data){
                if(nextNode.right == null){
                     nextNode.right = node;
                    return;
                }
                nextNode = nextNode.right;
            }
            }
        }
    }
    
    public void preOrder(Node nextNode){
        if(nextNode != null){
            System.out.print(nextNode.data+" ");
            preOrder(nextNode.left);
            preOrder(nextNode.right);
        }
    }
    public void inOrder(Node nextNode){
        if(nextNode != null){
            inOrder(nextNode.left);
            System.out.print(nextNode.data+" ");
            inOrder(nextNode.right);
        }
    }
    public void postOrder(Node nextNode){
        if(nextNode != null){
            postOrder(nextNode.left);
            postOrder(nextNode.right);
            System.out.print(nextNode.data+" ");
        }
    }
    
}
public class Runner{
    public static void main(String[] args){
    BST bst = new BST();
    bst.insert(40);
    bst.insert(20);
    bst.insert(10);
    bst.insert(30);
    bst.insert(60);
    bst.insert(50);
    bst.insert(70);
    
    
    bst.preOrder(bst.root);
    System.out.println();
    bst.inOrder(bst.root);
    System.out.println();
    bst.postOrder(bst.root);
    }
}