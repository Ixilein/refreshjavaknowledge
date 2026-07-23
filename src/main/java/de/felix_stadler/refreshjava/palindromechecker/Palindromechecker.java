package de.felix_stadler.refreshjava.palindromechecker;

public class Palindromechecker {
    static void main() {
        System.out.println(isPalindrome("abba"));
    }

    static String reverseString(String string){
        String reverse = "";
        for (int i = string.length() - 1; i >= 0 ; i--) {
            reverse += string.charAt(i);
        }
        return reverse;
    }

    static boolean isPalindrome(String original){
        boolean res = false;
        if (original.equals(reverseString(original))){
            res = true;
        }
        return res;
    }

}
