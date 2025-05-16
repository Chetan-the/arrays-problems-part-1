public class kadanealgo {
     /*
     the problem states that find the maximum subarray sum 
     from the array where the array is also having the negative values
     */
    //brute force soln
    public static void maxsubarraysum(int []arr){
       int n=arr.length;
       int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        int sum=0;
        for(int j=i;j<n;j++){
           sum+=arr[j];
            max=Math.max(max,sum);
        }
        //this will give the maxium sub array sum 
        //tc-o(n^2);
    }

    }
    public static void findmaxsubarrsum(int []arr){
//optimal solution using kadane algorithm to fins max sub array sum form the given array
int n=arr.length;
int max=Integer.MIN_VALUE;
int sum=0;
for(int i=0;i<n;i++){
    sum=sum+arr[i];
    max=Math.max(max,sum);
    if(sum<0){
        sum=0;
    }
    //this is kadane algorith which it gives max subarray sum from the given array
    

}
    }
    
    
    
}
