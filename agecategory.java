import java.util.Scanner;

class Main{
    public static void main (String args[])
    {
        Scanner input = new Scanner (System.in);

        int age = input.nextInt();
       
        if(age==0 || age<=12)
        {
             System.out.println("Child");

        }
        else if(age>=13 && age<=17)
        {
             System.out.println("Teenager");

        }
        else if(age>=18 && age<=59)
        {
             System.out.println("Adult");
        }
        else if(age>=60)
        {
             System.out.println("Senior Citizen");
        }

        input.close();
    }
}
