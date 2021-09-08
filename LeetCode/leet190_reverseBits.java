import java.util.*;
public class leet190_reverseBits 
{
    public static String reverseBits(int n)
    {
       String str=""; 
       while(n>0)
       {
           if(n%2==0)
           str="0"+str;
           else
           str="1"+str;

           n=n/2;
       }

       for(int i=str.length();i<=31;i++)
       str="0"+str;

       System.out.println(str);

       String temp="";
       for(int i=0;i<str.length();i++)
       {
           temp=str.charAt(i)+temp;
       }
    
       System.out.println(temp);
       return temp;
    }
    
    public static int b2d(String binary)
    {
        int dec=0;
        int base=1;
        int len=binary.length();
        for(int i=len-1;i>=0;i--)
        {
            if(binary.charAt(i)=='1')
            dec=dec+base;

            base=base*2;
        }
        return dec;
    }
    public static void main(String[] args)
    {
        Scanner br = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=br.nextInt();
        String rev=reverseBits(n);
        int num=b2d(rev);
        System.out.println(num);
        br.close();
    }  
}
