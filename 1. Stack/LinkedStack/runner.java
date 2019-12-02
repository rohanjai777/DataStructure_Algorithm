// Stcak mplementation using stack

class Node{
    int data;
    Node next;
}
class LinkedStack{
    Node top,head;      // top = last elment in stack
    int count=0; 
    
    public void push(int n){
        Node node = new Node(); 
        node.data = n;
        node.next = null;
        
        if(head == null){       // for addition of fist element in  stack
            head = node;
            top = node;
            System.out.println("Number pushed in stack"+node.data);
            count++;        // increse the number of element in stack
        }
        else{
            Node nextNode;
            nextNode = head;
            while(nextNode.next != null){
                nextNode = nextNode.next;
            }
            nextNode.next = node;   // saving new node to second last node(now)
            top = nextNode.next;     // pointing to last node while nextNode is pointing to second last node
            System.out.println("Number pushed in stack "+top.data );
            count++;
        }
    }
    public int pop(){
        Node nextNode; 
        if(head == null){           // if their is no node
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            nextNode = head;         // pointing to first node
            Node n1 = nextNode.next;    // pointing to second node or null if stack has only one node
            if(head != top){            // More than two node          
            while(n1.next != null){       // to find the last and second last node
                nextNode = nextNode.next;
                n1 = n1.next;
            }
            int returnData = n1.data;      // data of last node
            top = nextNode;                // top pointing to second last node, which is last after pop
            nextNode.next = null;       // saving null in second last node to pop the last node
            System.out.println("Number poped from stack "+returnData);
            count--;               // decreasing number of nodes
            return returnData;
        } 
        else{                           // if there is only one node
            int returnData = head.data;            
            System.out.println("Number poped from stack "+head.data);
            head = null;
            count--;
            return returnData;
        }
        
        }
    }
    public void show(){           // to show all the elements in stack
        Node nextNode = head;
            while(nextNode.next != null){
                System.out.print(nextNode.data+" ");
                nextNode = nextNode.next;
            }
            
            System.out.print(nextNode.data+" "+"\n");
    } 
    public int getTopElement(){       //  to get the top element
        if(top == null){  
            return -1;
        }
        return top.data;
    }
    
    public int getTop(){           //  to get no of elemnets
        return count;
    }
    public int getIndex(){       // to get the index of elemnt in stack
        return count-1;
    }
    
}
public class runner{
    public static void main(String[] args){
    LinkedStack ls = new LinkedStack();
    ls.push(10);
    ls.push(20);
    ls.push(30);
    ls.push(40);
    System.out.println(ls.getTop());
    ls.show();
    System.out.println(ls.pop());
    ls.show();
    ls.pop();
    ls.pop();
    ls.show();
    ls.pop();
    ls.pop();
    ls.push(5);
    ls.push(25);
    System.out.println(ls.getTopElement());
    System.out.println(ls.getTop());
    }
}