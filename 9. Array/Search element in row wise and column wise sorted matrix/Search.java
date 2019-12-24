/*
Problem :
Given row wise and column wise sorted matrix ,we need to search element with minimum time complexity.
Solution :
Solution 1:
You can simply search an element in 2D matrix but it will be done in O(R*C) complexity.

Solution 2:
Iterate over each row
Do binary search on rows unless you find the element.
If you do not find the element , return false.
Time complexity : O(C*logR)

Solution 3:
We will use below logic to search an element

Elements right to current element will be greater than element
Elements left to current element will be lesser than element
Elements down to current element will be greater than element
Elements top to current element will be lesser than element
Algorithm:
Starts with top right element, so initialise r=0 and c=
sortedMatrix[0].length-1
Iterate over matrix with boundary conditions.
If current element lets say m is equal to element X, return it.
If m < X, go left,so decrease column by 1 (c--).
If m > X, go right, so increase row by 1(r++).
Time complexity : O(R+C) this given below
*/

class Search{
    public void find(int a[][], int n){  // Array is sorted from top to bottom
        int c = a.length;   // no of columns
        int r = a[0].length; // no of rows
        int i=0;   
        int j = c;   // initially a[i][j]
        while(i<=r-1 && j>=0){    // run untill i< no of rows and j is greater than no of columns
        if(n == a[i][j]){   // if value found
            System.out.println("Found at index "+i+" "+j);
            return;
        }
        else if(a[i][j]<n){  // if n is greater then the top index of column then move down in column, increase row
            i++;
        }
        else if(n<a[i][j]){   // if n is less than the top index then, move to previous column
            j--;
        }
        }
    }
}

