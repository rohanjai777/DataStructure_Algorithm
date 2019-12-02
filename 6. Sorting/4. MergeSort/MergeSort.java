class MergeSort{
    public int[] mergeSort(int [] a){  // function for merge sort
        if(a.length <= 1){
            return a;       // if length of arrray is less than or equal to 1
        }
        else{
            int mid = a.length/2;    // if the middle position so to break the array
            int left[] = new int[mid];    // save the left part in left array
            int right[];                  // and right part in right array
            if(a.length%2 == 0){          
                right = new int[mid];     // if length of array was even, then both left and right arrays are equal
            }
            else{
                right = new int[mid+1];  // if length of array was odd, then length of right array is one more than the left array
            }
            
            for(int i=0;i<left.length;i++){
                left[i] = a[i];         // save the elements in left array
            }
            for(int i=0;i<right.length;i++){
                right[i] = a[left.length+i]; // save the elements in right array
            }
            
             
            left = mergeSort(left);        // applying the recurrsion, calling again mergeSort to break the array in left and right portion
            right = mergeSort(right);      // left and right, both array is broken untill it return one element
            int result[] = new int[a.length];    //  used to save the elements in the result.
            result = merge(left,right);     // last merge the two left and right arrays
            return result;
        }
    }
    public int[] merge(int[] left, int[] right){
        int i,j,k;   // counters to count the number of elements i = left, j = right, k= result;
        i=j=k=0;    // initially set to zero
        int [] result = new int[left.length + right.length]; // has length 2, if left = 1 element and right = 1 element  
        while(i<left.length || j<right.length){   // applying while loop, checking if counter of right counter is less than length of right and vise-versa for left
            if(i<left.length && j<right.length){    // if both right and has has non-zero element
                if(left[i]<right[j]){
                    result[k++] = left[i++];
                }
                else{
                    result[k++] = right[j++];
                }
            }
            else if(i<left.length){    // if right array has zero element
                result[k++] = left[i++]; // increasing the k and i and breaking the while loop
            }
            else if(j<right.length){   // if left zero has zero element
                result[k++] = right[j++]; // increasing the k and j and breaking the while loop
            }
        }
        return result;    // return the merged result array
    }
}
