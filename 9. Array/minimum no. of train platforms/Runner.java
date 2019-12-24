public class Runner{
    public static void main(String[] args){
        int a[] = {900,940,950,1100,1500,1800};  // arrival time
        int b[] = {910,1200,1120,1130,1900,2000};  // departure time
        Platforms p = new Platforms();
        System.out.println(p.findMin(a,b)); //
    }
}