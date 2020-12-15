/***
Age Bracket Identifier
by CodeChum

Cody wants to determine if The Programmer is an adult. An adult is anyone aged 18 and above. Input the Programmer's age then print "Adult" if he is an adult and "Minor" if he isn't.

Input Format

Enter a positive or zero integer indicating the Programmer’s age

Input Sample

19
Output Format

A single line container either "Adult" or "Minor"

Output Sample

Adult    ***/

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
