/*
Problem :
Given array of +ve and -ve integers ,we need to find a pair whose sum is closed to Zero in Array.
For example:
array[]={1,3,-5,7,8,20,-40,6};
The pair whose sum is closest to zero :  -5 and 6
*/
import java.lang.Math;
import java.util.Arrays;
class Pair{
    public int [] find(int a[]){
        Arrays.sort(a);   // firstly sort the array
        int b[] = new int[2];  // array to return pair
        int l=0; int r = a.length-1;
        int sum=Math.abs(a[l]+a[r]); // finding abs of sum
        
        while(l<r){
            int s = a[l]+a[r];
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

