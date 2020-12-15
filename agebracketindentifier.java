import java.util.Scanner;

class Main{
    public static void main (String args[])
    {
        Scanner input = new Scanner (System.in);

        int age = input.nextInt();
       
        if(age==0||age<18)
        {
             System.out.println("Minor");

        }

        else
        {
             System.out.println("Adult");
        }

        input.close();
    }
}
