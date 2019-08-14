/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        StringBuilder common = new StringBuilder();
        int i = 0;
        boolean flag = true;
        while (flag) {
            char current = '0';
            for (String str : strs) {
                if (i == str.length()) {
                    flag = false;
                    break;
                } else if (current == '0') {
                    current = str.charAt(i);
                } else if (current != str.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                common.append(current);
            }
            i++;
        }
        return common.toString();
    }
}
