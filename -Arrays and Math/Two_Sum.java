class Two_Sum
{
public void setZeroes(int[][] matrix) 
{
        int m=matrix.length,n=matrix[0].length,i,j;
        int ar[][]= new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            ar[i][j]=matrix[i][j];
        }
         for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    for(int k =0;k<m;k++)
                    {
                        for(int l=0;l<n;l++)
                        {
                            if(k==i || l==j)
                            ar[k][l]=0;
                        }
                    }
                }
            }
        }
         for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                matrix[i][j]=ar[i][j];
            }
        }
}
}
