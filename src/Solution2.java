public class Solution2 {
    static int counter = 0;
    static boolean ishappy(int n) {
        counter++;
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n = n / 10;
        }
        if (sum == 1) {
            counter = 0;
            return true;
        } else {
            if (counter > 100) {
                counter = 0;
                return false;
            }
            return ishappy(sum);
        }
    }
}
