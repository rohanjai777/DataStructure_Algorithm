public class Runner{
    public static void main(String [] args){
        QuickSort qs = new QuickSort();
        int a[] = {2,3,1,7,5,8,4,9};
        a = qs.sort(a,0,7);
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}