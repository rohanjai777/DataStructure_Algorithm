public class Runner{
    public static void main(String[] args){
        Search s = new Search();
        int[][] a = 
 { 
 { 1, 6, 10, 12, 20 }, 
 { 4, 8, 15, 22, 25 }, 
 { 5, 20, 35, 37, 40 },
 { 10, 28, 38, 45, 55 } 
 };
        s.find(a,37);
    }
}