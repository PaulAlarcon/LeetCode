import java.lang.reflect.Array;
import java.util.HashMap; // import the HashMap class



class Solution3 {

    static public int bruteForceMaxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int max = -2147483647;
        for(int i = 0; i < nums.length; i++)
            for(int j = 0 ; j <= i; j++)
                max = Math.max(sumArray(j, i, nums), max);
        return max;
    }

    static public int sumArray(int start, int end, int[] arr){
        int sum = 0;
        for(int i = start; i <= end; i++) sum += arr[i];
        return sum;
    }
}