import java.util.Arrays;
/*
Problem:
You are given arrival and departure time of trains reaching to a particular station. You need to find minimum number of platforms required to accommodate the trains at any point of time.
For example:
arrival[] = {1:00, 1:40, 1:50, 2:00, 2:15, 4:00} 
departure[] = {1:10, 3:00, 2:20, 2:30, 3:15, 6:00}
No. of platforms required in above scenario = 4
 
*/

class Platforms{  // class
    public int findMin(int a[], int b[]){ // function 
       Arrays.sort(a);         // firstly sort both the arrays in o(logn) time
       Arrays.sort(b);
       int platforms=1, neededPlatforms=1;  // define two variables platforms and needed platfroms as 1 because there will be at least 1 platform
       int i=1,j=0;   // define two variable as i=1, so to start from a[1], b[0]
       while(i<a.length && j<b.length){  // i pointer should not exceed the length and same for j
           if(a[i]>b[j]){   // if arrival is greater than departure then 
               platforms--;   // decrease the no. of paltforms
               j++;  // increase the departure time
           }
           else{          // if departure is greater than arrival, that means one train is already standing, so 
               i++;     // increase the arrival pointer 
               platforms++;  // and increase the no. of platforms
               if(platforms>neededPlatforms){  // also if platforms is greater than neededPlatforms than increase the no. of actual needed platforms 
                   neededPlatforms = platforms;
               }
           }
       }
       return neededPlatforms;  // return the needed platforms
    }
}
