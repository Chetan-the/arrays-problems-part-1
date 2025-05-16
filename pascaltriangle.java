import java.util.*;
public class pascaltriangle {
    public  void findelement(int row,int col){
        //the 1 st type is given the row and column number then based on that find the element in nth row and rth column number 
        int res=1;
     for(int i=0;i<col;i++){
        res=res*(row-i);
        res=res/(i+1);
     }
     System.out.println("res is :"+res);
    }
    //2nd type is given the row number then print the entire row
    public ArrayList<Integer> printrow(int n){
        ArrayList<Integer> temp=new ArrayList<Integer>();
        int res=1;
       temp.add(res);
        for(int i=0;i<n;i++){
            res=res*(n-i)/(i+1);
           temp.add(res);
        }
        return temp;
    }
    //3rd type is given the value of n and print the pascal triangle

   public ArrayList<ArrayList<Integer>>  printpascal(int n){
    ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
    for(int i=1;i<n;i++){
        ans.add(printrow(i));
    }
    return ans;
   }
    public static void main(String[] args) {
        pascaltriangle ps=new pascaltriangle();
        ps.findelement(10,3);
    }
    
}
