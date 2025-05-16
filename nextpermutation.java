public class nextpermutation {
    public void findnextpermutation(int[]arr){
        //brute force solution was finding all possible permuattions through recurssion and find the next element in it
        //optimal soln was
        //step 1: find the break point arr[i]<arr[i+1];
        int n=arr.length;
        int index=-1;
        for(int i=n-2;i>=0;i++){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(arr,0,n-1);
        }
        //step-2 after finding the breaking point then find the near sammlest element than thta and swap it
        for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
        }
        //step-3 reverse the next part of the array after we swapped the element then reverse that part
        reverse(arr,index+1,n-1);
        

    }
    public void reverse(int []arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }
    
}
