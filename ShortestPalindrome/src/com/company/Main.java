package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println(shortestPalindrome("koookllooo"));
    }

    public static String shortestPalindrome(String s) {


        if (ispalindrome(s)) {
            return s;
        } else {
            int amountadded = 0;
            String temp = "";
            StringBuilder TEMP = new StringBuilder(temp);
            StringBuilder S = new StringBuilder(s);
            for (int i = S.length(); i > 0; i--) {
                TEMP.append(s.charAt(i - 1));
                S.insert(0, TEMP);
                amountadded++;

                if (ispalindrome(S.toString())) {
                    return S.toString();
                } else {
                    S.delete(0, amountadded);
                }
            }

        }
        return s;
    }

    public static boolean ispalindrome(String s) {
        int q = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(q)) {
                q--;
            } else {
                return false;
            }
        }
        return true;
    }
}
