/*Problem:
You are given an sorted and rotated array as below:
 
int arr[]={16,19,21,25,3,5,8,10};
 
If you note that array is sorted and rotated. You need to search an element in above array 
in o(log n) time complexity.
*/
class Search{
    private int pivot(int a[],int low,int high){ //to find the pivot point, to show that new array start from here
        int mid = (low+high)/2;
        if(a[mid]>a[mid+1]){  // if next element is greater than mid the mid+1 is the pivot point
            return mid+1;  // return its index
        }
        else {
            if(a[low]>a[mid]){
                pivot(a,low,mid-1);  // if mid is smaller than low, then pivot lies in left part of array from low to mid-1
            }
            else if(a[high]<a[mid]){
                pivot(a,mid+1,high); // if mid is greater than high then pivot lies in right part of array from mid+1 to high
            }
        }
        return -1;  // if pivot element not found, then array is already sorted
    }
    public void searchElement(int a[],int element){  // function to search the element
        int pivotElement = pivot(a,0,a.length-1);  // for finding the pivot element.
        if(pivotElement != -1){     // if array is sorted and pivot is found
        if(a[pivotElement]<=element && element <= a[a.length-1]){   // if element is greater than or equal to pivot and less than or equal to high then element is found in right array
            binarySearch(a,pivotElement,a.length-1,element);
        }
        else{  // else if element is greater than or equal to low, and less than or equal to mid-1, then find element in left part
            binarySearch(a,0,pivotElement-1,element); // using binary search
        }
        
        }
        else{  // if array is already sorted, so no pivot found
            binarySearch(a,0,a.length-1,element);
        }
    }
    private void binarySearch(int a[],int low,int high,int element){
        int mid = (low+high)/2;
        if(a[mid] == element){
            System.out.println("Element found at index "+mid);
        }
        else{
            if(a[mid]>element){
                high = mid-1;
                binarySearch(a,low,high,element);
            }
            else{
                low = mid+1;
                binarySearch(a,low,high,element);
            }
        }
    }
}
