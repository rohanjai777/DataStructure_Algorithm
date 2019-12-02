// DoublyLinkedList

class DLL{
    private class Node{
        int data;
        Node next;
        Node previous;
    
        public Node(int data){
            this.data =data;
        }
    }
    
    Node head, tail;  // Declare both head and tail
    int count = 0;
    public void insert(int data){     
        Node node = new Node(data);
        if(head == null){       // insert a new node at the start and both head and tail points to it
            head = node;
            tail = node;
            count++;
        }
        else{
            if(tail != null){   // if list has more than one node  
            Node nextNode;
            nextNode = head;
            while(nextNode.next != null){
                nextNode = nextNode.next;
            }
            nextNode.next = node;    // last node will poit to the new node
            node.previous = nextNode;
            tail = node;
            }
            else{                  // if list has only one node
                head.next = node;
                tail = node;
                tail.previous = head;
            }
            count++;
        }
    }
    public void insertAtStart(int data){     // inserting a node at the starting of list
        Node node = new Node(data);
        node.next = head;
        head.previous = node;
        head = node;
        count++;
    }
    public void insertAt(int index, int data){   // inserting a node at the given index
        if(index <= count-1){        // checking the index within the range
        Node node = new Node(data);
        if(index == 0){            // if index is 0 then head will point to new node
            node.next = head;
            head.previous = node;
            head = node;
            count++;
        }
        else{             // if index is any other than 0 then it will put new node at that index and shift the rest nodes.
        Node nextNode = head ;
        for(int i=0;i<index-1;i++){
            nextNode = nextNode.next;
        }
        Node n1;
        n1 = nextNode.next;
        
        nextNode.next = node;
        node.previous = nextNode;
        
        n1.previous = node;
        node.next = n1;
        
        count++;
        }
        } 
        else{           // if the index is out of range
            System.out.println("Please enter a valid Index");
        }
    }
    public int deleteAt(int index){  // To delete a node at the given index
        if(index == 0){     // if index is 0
         deleteAtStart(); 
         
         return 0;
        }
        else if(index == count-1){ // if index is last
            deleteAtEnd();
            
             return 0;
        }
        else if(index >= count || index < 0){        // if index is out of Range
            System.out.println("Please enter a valid Index");
            return 0;
        }
        else{                 // if any other index, value will be deleted
        Node nextNode = head;
        for(int i=0;i<index-1;i++){
            nextNode = nextNode.next;
        }
        Node n1,n2;
        n1 = nextNode.next;
        n2 = n1.next;
        nextNode.next = n2;
        n2.previous = nextNode;
        count--;
        return n1.data;
        }
    }
    public int deleteAtStart(){     // delete at the begining
        int returnData = head.data;
        head = head.next;
        head.previous = null;
        count--;
        return returnData;
    }
    public int deleteAtEnd(){  // delete at the end
        int returnData = tail.data;
        tail = tail.previous;
        tail.next = null;
        count--;
        return returnData;
    }
    public void showForward(){   // List will start printing from forward direction
        Node nextNode = head;
        while(nextNode.next != null){
            System.out.print(nextNode.data+"-->");
            nextNode = nextNode.next;
        }
        System.out.print(nextNode.data+"\n");
    }
    public void showBackward(){     // list will start priniting in backward direction
        Node nextNode = tail;
        while(nextNode.previous != null){
            System.out.print(nextNode.data+"-->");
            nextNode = nextNode.previous;
        }
        System.out.print(nextNode.data+"\n");
    }
    public int getLastIndex(){         // to get the index of last node
        return count-1;  
    }
    public int countNode(){     //  to count number of nodes in given index
        return count;
    }
    
}

public class runner{
    public static void main(String [] args){
        DLL dll = new DLL();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insertAtStart(2);
        dll.showForward();
        dll.showBackward();
        System.out.println(dll.countNode());
        dll.insertAt(3, 55);
        dll.insertAt(0, 7);
        dll.showForward();
        dll.showBackward();
        System.out.println(dll.countNode());
        System.out.println(dll.getLastIndex());
        dll.deleteAt(5);
        dll.deleteAt(4);
        System.out.println(dll.countNode());
        
        dll.showForward();
        dll.showBackward();
        
    }
}