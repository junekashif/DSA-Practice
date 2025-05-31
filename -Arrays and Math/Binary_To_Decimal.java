import java.util.Scanner;
class Binary_To_Decimal
{
    public static int BinToDec(int BiNum)
    {
        int DecNum=0,pow=0;
        while(BiNum>0)
        {
            int d = BiNum%10;
            DecNum = DecNum + d * (int)Math.pow(2,pow);
            pow++;
            BiNum=BiNum/10;
        }
        return DecNum;
    }
    public static void main ( String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int n=sc.nextInt();
        System.out.println(BinToDec(n));
    }
}