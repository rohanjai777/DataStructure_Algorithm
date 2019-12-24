/*Given a sorted array,we need to find a pair whose sum is closed to number X in Array.
For example:
array[]={-40,-5,1,3,6,7,8,20};
The pair whose sum is closest to 5 :  1 and 3*/

// Time complexity is O(nlogn), and this is method 2, Method 1 is same as brutt force in closest to 0 with -n in sum.
import java.lang.Math;
import java.util.Arrays;
class Pair{
    public int [] find(int a[],int n){  // n is the number, whose closest pair we have to calculate
        Arrays.sort(a);   // firstly sort the array
        int b[] = new int[2];  // array to return pair
        int l=0; int r = a.length-1;
        int sum=Math.abs(a[l]+a[r]-n); // finding abs of sum-n so that closest value can be calculated
        
        while(l<r){
            int s = a[l]+a[r]-n;  // -n to calculate the closest of n absolute value
            if(sum>Math.abs(s)){  // compairing min sum with the sum of pairs
                    sum = Math.abs(s); // storing min sum 
                    b[0] = a[l];
                    b[1] = a[r];
            }
            if(s<0){  // if value of sum is negative, then increase the left pointer
                l++;
            }
            else if(s>=0){  // if vlaue of sum is greater than zero, then decrease the right pointer 
                r--;
            }
            
        }
        
        return b;   // return the array
    }
}

