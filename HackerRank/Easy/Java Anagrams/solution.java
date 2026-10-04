// HackerRank Problem: Java Anagrams
// Link: https://www.hackerrank.com/challenges/java-anagrams/problem
// Difficulty: Easy
// Language: java




    static boolean isAnagram(String a, String b) {
        // Complete the function
        
       a = a.toLowerCase();
       b = b.toLowerCase();
        if (a.length() != b.length()) {
            return false;
    }

    int[] count = new int[26];

    for (int i = 0; i < a.length(); i++) {
       count[a.charAt(i) - 'a']++;
}

for (int i = 0; i < b.length(); i++) {
    count[b.charAt(i) - 'a']--;
}
    for (int i = 0; i < a.length(); i++) {
        count[a.charAt(i) - 'a']++;
    }

    for (int i = 0; i < b.length(); i++) {
        count[b.charAt(i) - 'a']--;
    }

    for (int i = 0; i < 26; i++) {
        if (count[i] != 0) {
            return false;
        }
    }

    return true;
    }

