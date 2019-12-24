/*
Given an array of integers representing stock price on single day, find max profit that can be earned by 1 transaction.
So you need to find pair (buyDay,sellDay) where buyDay < = sellDay and it should maximise the profit. For example:
 
int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
Max profit can be gain by buying at 1th day(0 based indexing) and sell at 4th day.
Max profit = 99-12 =87
*/
class Stocks{
    public void function(int a[]){
        int buy = Integer.MAX_VALUE;  // this will give min a max value of integer
        int maxProfit = 0;  // max profit that we will get; sell - buy
        int sell = 0;   // max selling price to get max profit
        for(int i=0;i<a.length;i++){
            if(a[i]<buy){  // if value is less than buying value
                buy = a[i];
            }
            if(a[i]-buy>maxProfit){  // if max profit is less than crrent profit
                maxProfit = a[i]-buy;
                sell = a[i];  // new selling price to get maximum profit
            }
        }
        System.out.println(buy+" "+ sell);
    }
}
