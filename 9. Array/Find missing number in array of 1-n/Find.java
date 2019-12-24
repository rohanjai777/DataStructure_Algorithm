/*You are given an integer array containing 1 to n but one of the number from 1 to n in the array is missing. You need to provide optimum solution to find the missing number. Number can not be repeated in the arry.
Solution:
Find the sum of n number using formula n=n*(n+1)/2
Find the sum of elements present in given array.
Substract (sum of n numbers – sum of elements present in the array).*/

class Find{
    public int findNum(int a[]){
        int l = a.length;   // length or size of array
        int sum1 = ((l+1)*(l+2))/2; // n*(n+1)/2 is sum of natural numbers
        int sum2 = 0;
        for(int i=0;i<l;i++){
            sum2 = sum2+a[i];
        }
        return sum1-sum2; // return missing number
    }
}
