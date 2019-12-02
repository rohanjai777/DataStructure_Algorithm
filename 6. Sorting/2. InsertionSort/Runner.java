public class Runner{
    public static void main(String [] args){
        InsertionSort is = new InsertionSort();
        int a[] = {2,3,5,1,6,4};
        a = is.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}