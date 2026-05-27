import java.util.Scanner;
class pattern4
{
	public void solution(int n)
	{
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		pattern4 obj=new pattern4();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		obj.solution(n);
		sc.close();
	}
}
/*
6

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
*/