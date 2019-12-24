/*
You are given a array of integer. All numbers occur even number of times except one. You need to find the number which occurs odd number of time. You need to solve it with o(n) time complexity and o(1) space complexity.
For example:
int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
Number which occurs odd number of times is : 50
*/
class Odd{ // using the XOR function, because a^a = 0 and a^0 = a;
// that means, a^a^b^b^b^a^a^a^a^c^c = b because a^a =0, that means all even times will be 0 and odd times will be same
// so b^0 = b, hence last result is b only.
    public int search(int a[]){
        int r = 0;
        for(int i=0;i<a.length;i++){
            r = r^a[i];
        }
        return r;
    }
}
// this program can be solved in 3 ways, 
/*
1. using two for loops and compare elements, time o(n^2)
2. using hashtable and getting the odd one, time = o(n) but space is also o(n)
3. using XOR operation, time o(n) and space o(1)
*/ 