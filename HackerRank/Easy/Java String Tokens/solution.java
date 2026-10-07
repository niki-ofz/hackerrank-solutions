// HackerRank Problem: Java String Tokens
// Link: https://www.hackerrank.com/challenges/java-string-tokens/problem
// Difficulty: Easy
// Language: java

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        s = s.trim();

        if (s.length() == 0) {
            System.out.println(0);
        } else {

            String[] tokens = s.split("[ !,?._'@]+");

            System.out.println(tokens.length);

            for (String token : tokens) {
                System.out.println(token);
            }
        }

        sc.close();
    }
}
