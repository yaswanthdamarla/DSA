import java.util.Scanner;
class pattern1
{
    public void pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern1 a =new pattern1();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        a.pattern(n);
        sc.close();
    }
}
/*
4

* * * *
* * * *
* * * *
* * * *


*/