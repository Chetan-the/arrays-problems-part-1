public class buyandsellstocks {
    public int maxprofit(int[]arr){
        int n=arr.length;
        int mini=arr[0];
        int profit=0;
        for(int i=1;i<n;i++){
            int cost=arr[i]-mini;
            profit=Math.max(arr[i],cost);
            mini=Math.min(arr[i],mini);


        }
        return profit;
    }
    
}
