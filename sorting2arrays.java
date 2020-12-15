
/**
 * SORTING OF ARRAYS
 * 
 * Jhonella Jazmine R. Orquillo 
 * December 15, 2020
 */

import java.util.Scanner;

class Main{
    public static void main (String args[])
    {
        Scanner input = new Scanner (System.in);

        int first = input.nextInt();        
        int firstarr[] = new int[first];
        
        for(int i=0;i<first;i++)
        {
          firstarr[i] = input.nextInt();
        }
        
        int second = input.nextInt();        
        int secondarr[] = new int[second];
        
        for(int i=0;i<second;i++)
        {
          secondarr[i] = input.nextInt();
        }
        
        int newsize = first+second;
        
        int finalarr[] = new int[newsize];
        
        int hold,count=0;
        
         for(int i=0;i<newsize;i++)
        {
            if(count!=first){        
                finalarr[i] = firstarr[i];
                count++;
            }
            else
            {
                finalarr[i] = secondarr[i];}    
        }
        
        for(int j=0;j<newsize;j++)
        {
            for(int k=0;k<newsize;k++)
            {
                if(finalarr[j]>=finalarr[k])
                {
                    hold = finalarr[j];
                    finalarr[j]=finalarr[k];
                    finalarr[k]=hold;
                }
            }
        }
        
        for(int i=0;i<newsize;i++)
        {
            System.out.println(finalarr[i]);
        }

        input.close();
    }
}
