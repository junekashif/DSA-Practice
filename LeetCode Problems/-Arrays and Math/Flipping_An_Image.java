class Flipping_An_Image 
{
    public int[][] flipAndInvertImage(int[][] image) 
    {
        for(int i=0;i<image.length;i++)
        {
            int start=0,end=image.length-1;
            for(int j=0;j<image.length/2;j++)
            {
                if(start<end)
                {
                    int t = image[i][start];
                    image[i][start]=image[i][end];
                    image[i][end]=t;
                    start++;
                    end--;
                }
            }
            for(int j=0;j<image.length;j++)
            {
                if(image[i][j]==0)
                image[i][j]=1;
                else
                image[i][j]=0;
            }
        }
        return image;
    }
}
