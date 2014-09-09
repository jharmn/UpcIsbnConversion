package com.harmon.isbn;

/**
 * Calculates check digit for ISBN code
 */
public class Mod11Check {
    /**
     * Calculates check digit
     * @param digStr
     * @return
     */
    public static String calc(String digStr) {
        int len = digStr.length();
        int sum = 0, rem = 0;
        int[] digArr = new int[len];
        for (int k = 1; k <= len; k++) // compute weighted sum
            sum += (11 - k) * Character.getNumericValue(digStr.charAt(k - 1));
        if ((rem = sum % 11) == 0) return "0";
        else if (rem == 1) return "X";
        return (new Integer(11 - rem)).toString();
    }

    public static void main(String[] args) {
        System.out.println(args[0] + "-" + calc(args[0]));
    }
}