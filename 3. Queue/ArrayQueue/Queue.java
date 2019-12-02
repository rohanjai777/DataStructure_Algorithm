// implementaation of queue using array. 
// front and rear start from 0 ie first index
class Queue{
    int capacity;int a[] ;
    public Queue(int capacity){
        this.capacity = capacity;
        a = new int[capacity];
    }
    int front, rear, size;
    public void enqueue(int data){  //  for enqueue 
        if(isFull()){
            System.out.println("Queue is Full");  //  check if array is full
        }
        else{                  // add elements to array
        a[rear++] = data;      // rear is increased
        rear = rear%capacity;       // if rear is more than capacity then it must me made within index eg: if capacity = 0 and rear++ = 5, then next index for rear is 0 
        size++;
        }
    }
    public int dequeue(){
        if(isEmpty()){               // if queue is empty
            System.out.println("Queue is empty");
            return 0;
        }
        else{  // if queue is not empty, the remove the element from front
        int data = a[front];
        front++;
        front = (front)%capacity;  // if front is out of range then set it within the index range.
        size--;
        return data;}
        
    } 
    public void show(){       // to print the queue
        for(int i=0;i<size;i++){
            System.out.print(a[(front+i)%capacity]+" ");    // start from front element and end at rear
            
        }
        System.out.print("\n");
    }
    public int getSize(){  //  print the size of the queue
        return size;
    }
    public boolean isFull(){        // if queue is full 
        return getSize() == 5;
    }
    public boolean isEmpty(){     //  check if queue is empty
        return getSize() == 0;
    }
    
}