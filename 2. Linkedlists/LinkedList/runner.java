class Node{              // create your node
    int data;
    Node next;          // Node variable to point to next node
}

class LinkedList{ 
    Node head;  // for the first element
    int count = 0;  //  to count no. of nodes
    public void insert(int n){
        Node node = new Node();  // create a new node to insert value
        node.data = n;
        node.next = null;  
        
        if(head == null){
            head = node;         // if its your first node then save it in head variable for refernce
        }
        else{
            Node nextNode = head;                  // Making a variable to traverse
            while(nextNode.next != null){         // if its not first node then traverse to the last null node
                nextNode = nextNode.next;        // to move to next node using the nextNode.next refernce variable
            }
            nextNode.next = node;                // finally saving the node in nextNode.next ==> saving in last node.
        }
        count++;
    }
    
    public void show(){                  
        Node nextNode = head;
        while(nextNode.next != null){                //  travesing and getting the last node.
            System.out.println(nextNode.data);
            nextNode = nextNode.next;                // to move to next node
        }
        System.out.println(nextNode.data);
    }
    
    public int countNodes(){
        return count;
    }
    
    public void insertAtStart(int n){
        Node node = new Node();  // create a new node
        node.data = n;
        node.next = null;
        
        node.next = head;        // save the head in next of node
        head = node;
        count++;
    }
    
    public void insertAt(int index, int n){
        Node node = new Node();  // create a new node
        node.data = n;
        node.next = null;
        
        if(index == 0){                  // if its a first node 
            insertAtStart(n);
        }
        else{
            Node nextNode = head;           // treverse at the given index
            for(int i=0;i<index-1;i++){
                nextNode = nextNode.next;        // store the refernce of next node
            }
            node.next = nextNode.next;           //new node ==> next node
            nextNode.next = node;                //previous node ==> new node
        }
        count++;
    }
    
    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }
        else{
            Node nextNode = head;
            for(int i=0;i<index-1;i++){
                nextNode = nextNode.next;
            }
            Node n1 = nextNode.next;  // address of 2
            nextNode.next = n1.next;  // next in 1 ==> address of 3 
            n1 =null;
        }
    }
}

public class runner{
    public static void main(String [] args){
    LinkedList l = new LinkedList();
    l.insert(10);
    l.insert(20);
    l.insert(30);
    l.insert(50);
    l.insert(60);
    l.insertAtStart(70);
    l.insertAtStart(7);
    l.insertAt(2,42);
    l.insertAt(0,52);
    System.out.println(l.countNodes());
    l.show();
    System.out.println();
    l.deleteAt(2);
    l.show();
}
}