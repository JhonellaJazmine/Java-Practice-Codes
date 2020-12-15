/****All Your Base 7 Are Belong to Us by CodeChum

MWAHAHA *evil laugh* ?

I am evil space person trying to invade your base,
Base 7. I was sent here by my superiors to eradicate all intellectually inferior people,
and I was told that people inside your base are part. I will give you chance, however.
If you manage to solve this simple sequence of numbers, I will spare you and everyone inside Base 7.

Input Format

A single line containing an integer

Input Sample

5
Output Format

A single line containing n integers

Output Sample

4·9·21·40·66 ****/


import java.util.Scanner;

class Main{
    public static void main (String args[])
    {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        int d  = 4;
        int temp = 5;

        for(int i=0;i<n;i++)
        {
            if(i==0){
                System.out.print(d+" ");
                d=d+temp;
                temp=temp+7;}
            else
            {
                System.out.print(d+" ");
                d=d+temp;
                temp=temp+7;
            }
           
        }

        input.close();
    }
}
