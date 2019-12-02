public class Runner{
   public static void main(String [] args){
       BinarySearch bs = new BinarySearch();
       int a[] = {1,2,3,4,5,6,7,8,9};
       bs.searchElement(a,7);
       bs.searchElement(a,9);
       bs.searchElement(a,2);
       bs.searchElement(a,20);
   } 
}