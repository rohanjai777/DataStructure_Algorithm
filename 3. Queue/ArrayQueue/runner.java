public class runner{
    public static void main(String [] args){
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.show();
        q.dequeue();
        q.dequeue();
        q.show();
        q.dequeue();
        q.dequeue();
        q.enqueue(1);
        q.enqueue(2);
        q.show();
        System.out.println(q.getSize());
        System.out.println(q.isFull());
        System.out.println(q.isEmpty());
    }
}