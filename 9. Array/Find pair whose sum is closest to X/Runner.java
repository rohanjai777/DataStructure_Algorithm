public class Runner{
    public static void main(String[] args){
        Pair p = new Pair();
        int a[] = {1,3,-5,7,8,20,-40,6};
        int b[] = new int[2];
        b = p.find(a,5);
        System.out.println(b[0]+" "+b[1]);
    }
}