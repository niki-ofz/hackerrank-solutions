// HackerRank Problem: Java If-Else
// Link: https://www.hackerrank.com/challenges/java-if-else/problem
// Difficulty: Easy
// Language: java


import java.util.Scanner;

public class Solution {
    public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);
    int n =s.nextInt();
    if(n%2 == 0)
    {
        if(n>=2 && n<=5)
        {
            System.out.println("Not Weird");
        }
        else if(n>=6 && n<=20)
        {
            System.out.println("Weird");
        }
        else
        {
             System.out.println("Not Weird");
        }
        
    }
    else
    {
        System.out.println("Weird");
        
    }
    }
}




    
     
