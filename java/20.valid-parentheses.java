/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */
class Solution {
    public boolean isValid(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int length = stringBuilder.length();
            char current = s.charAt(i);
            if (isOpenChar(current)) {
                stringBuilder.append(current);
            } else if (length == 0) {
                return false;
            } else {
                if (stringBuilder.charAt(length - 1) != getOpen(current)) {
                    return false;
                } else {
                    stringBuilder.deleteCharAt(length - 1);
                }
            }
        }
        return stringBuilder.length() == 0;
    }

    private boolean isOpenChar(char c) {
        switch (c) {
        case '(':
        case '[':
        case '{':
            return true;
        default:
            return false;
        }
    }

    private char getOpen(char close) {
        switch (close) {
        case ')':
            return '(';
        case ']':
            return '[';
        case '}':
            return '{';
        default:
            return '0';
        }
    }
}
