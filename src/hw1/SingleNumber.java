package hw1;

public class SingleNumber {
    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};

        System.out.println("Single number in nums1: " + findSingleNumber(nums1));
        System.out.println("Single number in nums2: " + findSingleNumber(nums2));
    }
}
