class BubbleSort{
    public int[] sort(int a[]){
        for(int i=0;i<a.length-1;i++){      //  start the loop 
          for(int j=0;j<a.length-1-i;j++){   // Last element should not be counted because its already sorted
              if(a[j]>a[j+1]){         // if a[j]<a[j+1] then swap these two numbers
                  int temp = a[j]; 
                  a[j] = a[j+1];
                  a[j+1] = temp;
              }
          }  
        }
        return a; // return the array
    }
}