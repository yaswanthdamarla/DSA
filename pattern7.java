import java.util.Scanner;
public class pattern7 {
   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int n=sc.nextInt();
        pattern a = new pattern();
        a.geroge(n);
        sc.close();
    }
}
 class pattern
    {
        public void geroge(int n){
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n-i-1; j++)
                {
                    System.out.print(" ");
            }
        }
    }
}