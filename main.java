public class main{
    //brute force solution
     //if in the matrix if there is zero then mark entire row and column as zero 
     public void markrow(int[][] matrix,int i,int m){
        for(int j=0;j<m;j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
     } 
     public void markcol(int [][]matrix,int j,int n){
        for(int i=0;i<n;i++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
     } 
    public  void setmatzero(int[][]matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    markrow(matrix,i,m);
                    markcol(matrix,j,n);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
        //time complexity for brute force-0(n*m)*o(n+m)*o(n*m)~0(n^3)
       
    }
     //better solution
     public static void setmzero(int[][]matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        int []row=new int[n];
        int[]col=new int[m];
        for(int i=0;i<n;i++){
            row[i]=0;
        }
        for(int j=0;j<m;j++){
            col[j]=0;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        //time complexity for better solution is o(2*(n*m))
        //space complexity-o(n)+o(m)

        
    }
   
    //optimal solution
    public static void setmatrixszero(int[][]matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        int col0=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=1;

                }
                if(j!=0){
                    matrix[0][j]=1;
                }
                else{
                    col0=1;
                }
               
                
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==1 || matrix[0][j]==1){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<n;j++){
                matrix[0][j]=1;
            }
        }
        if(col0==1){
            for(int i=0;i<n;i++){
                matrix[i][0]=1;
            }

        }
    }
    

}