/*
Problem :
Given array of +ve and -ve integers ,we need to find a pair whose sum is closed to Zero in Array.
For example:
array[]={1,3,-5,7,8,20,-40,6};
The pair whose sum is closest to zero :  -5 and 6
*/

import java.lang.Math;

class Pair{
    public int [] find(int a[]){   // check only absolute value which will give the closure of the value
        int b[] = new int[2];
        int sum = Math.abs(a[0]+a[1]);  // initial sum
        for(int i=0;i<a.length;i++){ 
            for(int j=i+1;j<a.length;j++){
                int s = a[i]+a[j]; 
                if(sum>Math.abs(s)){  // if absoulte value of sum > than abs of given sum then replace sum with abs of s
                    sum = Math.abs(s);
                    b[0] = a[i];
                    b[1] = a[j];
                }
            }
        }
        return b;
    }
}

public class Runner{
    public static void main(String[] args){
        Pair p = new Pair();
        int a[] = {1,3,-5,7,8,20,-40,5};
        int b[] = new int[2];
        b = p.find(a);
        System.out.println(b[0]+" "+b[1]);
    }
}