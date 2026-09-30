# Java Substring Comparisons

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Java Substring Comparisons](https://www.hackerrank.com/challenges/java-string-compare/problem)

## Problem Description

We define the following terms:

*
[Lexicographical Order](https://en.wikipedia.org/wiki/Lexicographical_order), also known as *alphabetic* or *dictionary* order, orders characters as follows: **

For example, `ball < cat`, `dog < dorm`, `Happy < happy`, `Zoo < ball`.

* A [substring](https://en.wikipedia.org/wiki/Substring) of a string is a contiguous block of characters in the string. For example, the substrings of `abc` are `a`, `b`, `c`, `ab`, `bc`, and `abc`.

Given a string, , and an integer, , complete the function so that it finds the lexicographically *smallest* and *largest* substrings of length .

Function Description**

Complete the *getSmallestAndLargest* function in the editor below.

*getSmallestAndLargest* has the following parameters:

* *string s:* a string

* *int k:* the length of the substrings to find

**Returns**

* *string:* the string ' + "\n" + ' where and are the two substrings

**Input Format**

The first line contains a string denoting . **
The second line contains an integer denoting .

Constraints**

*

*  consists of English alphabetic letters only (i.e., `[a-zA-Z]`).

**Sample Input 0**

```
welcometojava
3

```

**Sample Output 0**

```
ava
wel

```

**Explanation 0**

String  has the following lexicographically-ordered substrings of length :

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., `ava\nwel`).

The stub code in the editor then prints `ava` as our first line of output and `wel` as our second line of output.

## Examples



## Constraints



## Solution

```java
// HackerRank Problem: Java Substring Comparisons
// Link: https://www.hackerrank.com/challenges/java-string-compare/problem
// Difficulty: Easy
// Language: java



    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        
        for(int i = 0 ; i <= s.length() - k ; i++)
        {
            String sub = s.substring(i, i+k);
             
            if(sub.compareTo(smallest) < 0)
            {
                smallest = sub;
            }
            
            if(sub.compareTo(largest) > 0)
            {
                largest = sub;
            }
            
            
            
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
