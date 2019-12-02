public class Runner{
    public static void main(String[] args){
    MergeSort m = new MergeSort();
    int a[] = {5, 6 ,4 , 1 ,2,0};
    a = m.mergeSort(a);
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
    }
}