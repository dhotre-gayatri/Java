package Strings_06;

public class ValidAnagramProblem_13 {
    // AnagramCheckerInMain.java
public class AnagramCheckerInMain {

    public static void main(String[] args) {
        // --- Test Case 1 ---
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Checking '" + s1 + "' and '" + t1 + "'...");
        boolean result1 = true; // Assume true, prove false

        if (s1.length() != t1.length()) {
            result1 = false;
        } else {
            int[] charCounts1 = new int[26];

            for (int i = 0; i < s1.length(); i++) {
                charCounts1[s1.charAt(i) - 'a']++;
            }

            for (int i = 0; i < t1.length(); i++) {
                charCounts1[t1.charAt(i) - 'a']--;
                if (charCounts1[t1.charAt(i) - 'a'] < 0) {
                    result1 = false;
                    break; // No need to check further if a mismatch is found
                }
            }
        }
        System.out.println("Is '" + s1 + "' and '" + t1 + "' an anagram? " + result1); // Expected: true
        System.out.println("--------------------");

        // --- Test Case 2 ---
        String s2 = "rat";
        String t2 = "car";
        System.out.println("Checking '" + s2 + "' and '" + t2 + "'...");
        boolean result2 = true;

        if (s2.length() != t2.length()) {
            result2 = false;
        } else {
            int[] charCounts2 = new int[26];

            for (int i = 0; i < s2.length(); i++) {
                charCounts2[s2.charAt(i) - 'a']++;
            }

            for (int i = 0; i < t2.length(); i++) {
                charCounts2[t2.charAt(i) - 'a']--;
                if (charCounts2[t2.charAt(i) - 'a'] < 0) {
                    result2 = false;
                    break;
                }
            }
        }
        System.out.println("Is '" + s2 + "' and '" + t2 + "' an anagram? " + result2); // Expected: false
        System.out.println("--------------------");

        // --- Test Case 3 ---
        String s3 = "hello";
        String t3 = "olleh";
        System.out.println("Checking '" + s3 + "' and '" + t3 + "'...");
        boolean result3 = true;

        if (s3.length() != t3.length()) {
            result3 = false;
        } else {
            int[] charCounts3 = new int[26];

            for (int i = 0; i < s3.length(); i++) {
                charCounts3[s3.charAt(i) - 'a']++;
            }

            for (int i = 0; i < t3.length(); i++) {
                charCounts3[t3.charAt(i) - 'a']--;
                if (charCounts3[t3.charAt(i) - 'a'] < 0) {
                    result3 = false;
                    break;
                }
            }
        }
        System.out.println("Is '" + s3 + "' and '" + t3 + "' an anagram? " + result3); // Expected: true
        System.out.println("--------------------");

        // --- Test Case 4 (Edge Case: Empty Strings) ---
        String s4 = "";
        String t4 = "";
        System.out.println("Checking '" + s4 + "' and '" + t4 + "'...");
        boolean result4 = true;

        if (s4.length() != t4.length()) {
            result4 = false;
        } else {
            int[] charCounts4 = new int[26];

            for (int i = 0; i < s4.length(); i++) { // Loop won't run for empty string
                charCounts4[s4.charAt(i) - 'a']++;
            }

            for (int i = 0; i < t4.length(); i++) { // Loop won't run for empty string
                charCounts4[t4.charAt(i) - 'a']--;
                if (charCounts4[t4.charAt(i) - 'a'] < 0) {
                    result4 = false;
                    break;
                }
            }
        }
        System.out.println("Is '" + s4 + "' and '" + t4 + "' an anagram? " + result4); // Expected: true
        System.out.println("--------------------");

        // --- Test Case 5 (Edge Case: Different Lengths) ---
        String s5 = "ab";
        String t5 = "a";
        System.out.println("Checking '" + s5 + "' and '" + t5 + "'...");
        boolean result5 = true;

        if (s5.length() != t5.length()) {
            result5 = false; // Directly sets to false due to length mismatch
        } else {
            // This else block won't be reached because lengths are different
            int[] charCounts5 = new int[26];

            for (int i = 0; i < s5.length(); i++) {
                charCounts5[s5.charAt(i) - 'a']++;
            }

            for (int i = 0; i < t5.length(); i++) {
                charCounts5[t5.charAt(i) - 'a']--;
                if (charCounts5[t5.charAt(i) - 'a'] < 0) {
                    result5 = false;
                    break;
                }
            }
        }
        System.out.println("Is '" + s5 + "' and '" + t5 + "' an anagram? " + result5); // Expected: false
        System.out.println("--------------------");
    }
}
    
}
