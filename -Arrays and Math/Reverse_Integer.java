import java.util.*;
class Reverse_Integer 
{
    public int reverse(int x) 
    {
        int d,n=Math.abs(x),r=0;
        while(n>0)
        {
            d=n%10;
            n=n/10;
            if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && d > 7)) return 0;
            if (r < Integer.MIN_VALUE / 10 || (r == Integer.MIN_VALUE / 10 && d < -8)) return 0;
            r=r*10+d;
        }
        return (x<0)?-r:r;
    }
}