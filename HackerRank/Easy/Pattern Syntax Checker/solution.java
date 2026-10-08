// HackerRank Problem: Pattern Syntax Checker
// Link: https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
// Difficulty: Easy
// Language: java

import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {

            String pattern = sc.nextLine();

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }

        sc.close();
    }
}


