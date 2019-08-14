import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        long reversed = 0;
        int tmp = x;
        while (tmp > 0) {
            reversed = reversed * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        return reversed == x;
    }

    public boolean isPalindromeByString(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        String xStr = String.valueOf(x);
        int i = 0;
        int j = xStr.length() - 1;
        while (i < j) {
            if (xStr.charAt(i) != xStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);

            boolean ret = new PalindromeNumber().isPalindromeByString(x);

            System.out.print(ret);
        }
    }

}
