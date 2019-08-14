/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 *
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (25.09%)
 * Total Accepted:    601.7K
 * Total Submissions: 2.4M
 * Testcase Example:  '123'
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * 
 * Input: 123
 * Output: 321
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -123
 * Output: -321
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 120
 * Output: 21
 * 
 * 
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of
 * this problem, assume that your function returns 0 when the reversed integer
 * overflows.
 * 
 */
class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE/10;
        int min = Integer.MIN_VALUE/10;
        int reversed = x%10;
        x = x /10;
        while(x!=0){
            int pop = x % 10;
            x = x /10;
            if(reversed > 0 && (reversed > max || ((reversed == max) && (pop > 7))))
                return 0;
            if(reversed < 0 && (reversed < min || ((reversed == min) && (pop < -8))))
                return 0;
            reversed = reversed*10+pop;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println("Hello World！");
    }
}