// HackerRank Problem: Java Loops II
// Link: https://www.hackerrank.com/challenges/java-loops/problem
// Difficulty: Easy
// Language: java

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int j  = 1 ; j <= t ; j++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum  = a ;
            int power = 1 ;
            for(int i=0;i<n;i++)
            {
                 sum = sum + (b * power );
                 System.out.print(sum + " ");
                 power = power * 2; 
         }
         
          System.out.println();
         
        }
       
      
        
        
       
        in.close();
    }
}
