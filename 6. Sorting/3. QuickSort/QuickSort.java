class QuickSort{
    public int partition(int a[], int low, int high){
        int pivot = a[(low+high)/2];
        while(low<=high){
        while(a[low]<pivot){
            low++;
        }
        while(a[high]>pivot){
            high--;
        }
        if(low<=high){
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
        }
    
        return low;
    }
    public void sort(int a[], int low, int high){
        int p = partition(a,low,high);
        if(low < p-1){
            partition(a,low,p-1);
        }
        if(p<high){
            partition(a,p,high);
        }
    }
    public void printArray(int a[]){
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
        
    }
}
public class Runner{
    public static void main(String[] args){
        QuickSort qs = new QuickSort();
        int a[] = {2,5,10,3,7,1,9,8};
        qs.sort(a,0,a.length-1);
        qs.printArray(a);
    }
}