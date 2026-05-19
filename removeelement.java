package smenomer;
public class removeelement {
    static class Solution {
        public int removeElement(int[] nums, int val) {
            int rd = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[rd] = nums[i];
                    rd++;
                }
            }
            return rd;
        }
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        Solution obj = new Solution();
        int result = obj.removeElement(nums, val);
        System.out.println("New length = " + result);
        System.out.print("Updated array = ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}