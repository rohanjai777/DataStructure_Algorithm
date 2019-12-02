class BinarySearch{
    public int searchElement(int a[], int n){
        int first=0, last, middle;
        last = a.length - 1;
        middle = (first+last)/2;
        while(first<=last){
            if(a[middle]>n){
                last = middle-1;
            }
            else if(a[middle]<n){
                first = middle+1;
            }
            else{
                System.out.println("Elemet found at index"+middle);
                return middle;
            }
            middle = (first+last)/2;
        }
        System.out.println("Element not found");
        return -1;
        
    }
}