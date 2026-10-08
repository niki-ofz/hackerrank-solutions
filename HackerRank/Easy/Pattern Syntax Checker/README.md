# Pattern Syntax Checker

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Pattern Syntax Checker](https://www.hackerrank.com/challenges/pattern-syntax-checker/problem)

## Problem Description

Using **Regex**, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.

In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

**Note**: In this problem, a regex is only valid if you can compile it using the  [Pattern.compile](http://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#compile%28java.lang.String%29) method.

**Input Format**

The first line of input contains an integer , denoting the number of test cases. The next  lines contain a string of any printable characters representing the pattern of a regex.

**Output Format**

For each test case, print `Valid` if the syntax of the given pattern is correct. Otherwise, print `Invalid`. Do not print the quotes.

**Sample Input**

```
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

```

**Sample Output**

```
Valid
Invalid
Invalid

```

## Examples



## Constraints



## Solution

```java
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



```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
