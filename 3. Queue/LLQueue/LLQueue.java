class LLQueue{
    
    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    Node head, tail;
    int count=0;
    public void enqueue(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
            count++;
        }
        else{
            tail.next = node;
            tail = node;
            count++;
        }
        
    }
    public void dequeue(){
        if(countNode() == 1){
            head = null;
            tail = null;
            count--;
        }
        else if(isEmpty()){
            System.out.println("There is no node element in queue");
        }
        else{
            head = head.next;
            count--;
        }
    }
    public void show(){
        Node nextNode;
        nextNode = head;
        while(nextNode != null){
            System.out.print(nextNode.data+" ");
            nextNode = nextNode.next;
        }
        System.out.print("\n");
    }
    public boolean isEmpty(){
        return count==0;
    }
    public int countNode(){
        return count;
    }
}