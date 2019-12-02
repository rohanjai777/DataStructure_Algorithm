public class Runner{
    public static void main(String[] args){
        BubbleSort bs = new BubbleSort();
        int arr[] = {3,5,2,1,8,0,4};
        arr = bs.sort(arr);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}