import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should 
        be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int line = 1;
        
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(line + " " + s);
            line++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna