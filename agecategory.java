/*** 
Age Category
by CodeChum

It’s time for the annual city Sportsfest. All individuals young and old may join but it wouldn’t be fair to match a young player against an older one. So to keep the event fun, we decided to hold separate tournaments for different age groups. The categories are:

Child - 0 to 12 years old
Teenager - 13 to 17 years old
Adult - 18 to 59 years old
Senior Citizen - 60 years old and above
Let’s try to do this as quick as possible by using the power of technology and programming!

Input Format

A single line containing the age.

Constraint:
- 0 <= age <= 99

Input Sample

14
Output Format

A single line containing the appropriate age category

Output Sample

Teenager  ***/


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
