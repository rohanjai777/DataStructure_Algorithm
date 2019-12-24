/*
Given an unsorted array, you need to find second largest element in the array in o(n) time complexity.
For example:
 
int[] arr1={7,5,6,1,4,2};
Second largest element in the array : 6

*/class SecondHighest{
    public int search(int a[]){
        int n1 = a[0]; // first element
        int n2 = -1;  // second largest element
        if(a.length <=1){
            System.out.println("Array has only one or less elements");
        }
        else{
        for(int i=0;i<a.length;i++){
            if(n1<a[i]){ // compare the first element, if element of array is greater then store it in another
                n2 = n1;
                n1 = a[i];
            }
            else if(n2<a[i]){  // if element is greater than second but less than third.
                n2 = a[i];
            }
        }
        }
        return n2;
    }
}
