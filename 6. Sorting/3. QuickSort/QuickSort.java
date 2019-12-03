// Program for QuickSort in java
class QuickSort{
    public int[] sort(int [] a, int low, int high){
        int mid = (low+high)/2;
        int i= low;
        int j= high;
        int pivot = a[mid];
        while(i<=j){
            while(a[i]<pivot){
                i++;
            }
            while(a[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if(low<j){
            sort(a,low,j);
        }
        if(high>i){
            sort(a,i,high);
        }
        return a;
    } 
}