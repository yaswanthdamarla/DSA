import java.util.Scanner;
public class pattern3 {
    public void solution(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        pattern3 a = new pattern3();
        int n=sc.nextInt();
        a.solution(n);
        sc.close();

    }
}
/*
5

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
 */