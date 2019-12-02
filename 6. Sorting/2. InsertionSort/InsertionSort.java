class InsertionSort{
    public int[] sort(int a[]){
        int k;
        for(int i=1;i<a.length;i++){
            k = a[i];
            for(int j=i-1;j>=0;j--){
                if(k<a[j]){
                  int temp = a[j];
                  a[j] = a[j+1];
                  a[j+1] = temp;
                 }
            }
        }
        return a;
    }
}