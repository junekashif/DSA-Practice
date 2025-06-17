class Trapping_Rain_Water 
{
    public int trap(int[] height) 
    {
        int n=height.length,w=0;
        for(int i=1;i<n-1;i++)
        {
            int mx1=0,mx2=0;
            for(int j=i-1;j>=0;j--)
            {
                if(mx1<height[j])
                mx1=height[j];
            }
            if(mx1<height[i])
            mx1=height[i];
            for(int j=i+1;j<n;j++)
            {
                if(mx2<height[j])
                mx2=height[j];
            }
            if(mx2<height[i])
            mx2=height[i];
            w+=(Math.min(mx1,mx2)-height[i]);
        }
        return w;
    }
}
