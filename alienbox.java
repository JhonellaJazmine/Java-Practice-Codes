import java.util.Scanner;

class Main{
    public static void main (String args[])
    {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
       
        for(int i=1;i<=n;i++)
        {
             for(int j=1;j<n;j++)
            {
                 System.out.print(i+" ");

                 if(j==n-1)
                 {
                    System.out.println(i+1);
                 }
            }
            //System.out.println("\n");
        }

        input.close();
    }
}
