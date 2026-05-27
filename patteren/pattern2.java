import java.util.*;
public class pattern2 {
    public void solution(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern2 a = new pattern2();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        a.solution(n);
        sc.close();
    }
}
/*
5

* 
* * 
* * * 
* * * * 
* * * * * 
*/