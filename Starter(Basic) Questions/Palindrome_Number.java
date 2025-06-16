class Palindrome
 {
    public boolean isPalindrome(int x)
     {
        int r=0,n=x;
        while(n>0)
        {
            int d=n%10;
            n=n/10;
            r=r*10+d;
        }
        return r==x;
        
     }
}