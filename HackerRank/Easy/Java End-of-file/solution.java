// HackerRank Problem: Java End-of-file
// Link: https://www.hackerrank.com/challenges/java-end-of-file/problem
// Difficulty: Easy
// Language: java

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int line = 1;
        
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(line + " " + s);
            line++;
        }
    }
}
