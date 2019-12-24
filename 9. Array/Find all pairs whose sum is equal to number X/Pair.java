import java.lang.Math;
import java.util.Arrays;
/*
Problem :
Given a  array,we need to find all pairs whose sum is equal to number X.
For example:
array[]={ -40, -5, 1, 3, 6, 7, 8, 20 };
Pair of elements whose sum is equal to 15 :  7, 8 and -5, 20
 
Solution :
Method 1 = brutt force o(n^2)
Method 2 = hashmap O(nlogn) space = O(n)
Method 3 = this  time O(nlogn)
*/

class Pair{
    public void find(int a[],int n){  // n is the number, which is equal to sum
        Arrays.sort(a);   // firstly sort the array
        int l=0; int r = a.length-1; // 
        
        while(l<r){
            int s = a[l]+a[r];  
            if(s == n){  // if s is equal to n then print a[l] and a[r]
                    System.out.println(a[l]+" "+a[r]);
                    l++;r--; // increase the l and decreease the r
            }
            if(s<n){  // if value of s is less than sum, then increase the left pointer
                l++;
            }
            else if(s>n){  // if vlaue of sum is greater than n, then decrease the right pointer 
                r--;
            }
            
        }
    }
}

