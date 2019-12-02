public class Runner{
    public static void main(String [] args){
        LLQueue q = new LLQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.show();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.show();
    }
}