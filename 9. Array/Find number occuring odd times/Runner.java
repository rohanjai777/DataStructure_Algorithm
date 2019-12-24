public class Runner{
    public static void main(String[] args){
        Odd h = new Odd();
        int a[] = {1,2,1,2,1,1,2,2,3,3,3};
        int n = h.search(a);
        System.out.println(n);
    }
}