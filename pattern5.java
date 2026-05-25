import java.util.Scanner;
class pattern5
{
	public void solution(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=n;i<j;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		pattern5 obj = new pattern5();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		obj.solution(n);
		sc.close();
	}
}
/*
4
* * * * 
* * * 
* * 
*
*/