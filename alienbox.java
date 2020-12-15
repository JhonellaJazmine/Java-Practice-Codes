/*** 
Alien Box
by CodeChum

You may be curious why we, the government, has kidnapped and you and has been keeping you locked up in here. We’ve been watching you and we know what you’re capable of. We uncovered a mysterious box thingy from an extraterrestrial U.F.O. last week and it has a strange pattern. The President thinks that uncovering the contents of this box could open up trade relations with the aliens so you MUST help us. It seems like that for whatever number you input, the box changes its pattern and we definitely see something strange going on at the end of the row but thats all we have been able to observe. You have no choice but to help us because the fate of the country’s trade relations depend on you.

Input Format

The positive integer n you inputted.

Constraint:
- n >= 2

Input Sample

4
Output Format

The pattern of the box.

Output Sample

1·1·1·2
2·2·2·3
3·3·3·4
4·4·4·5  ***/


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
