package smenomer;

import java.util.Arrays;

class twosums {

    public int[] twoSums(int nums[], int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        twosums obj = new twosums();

        int nums[] = {2, 7, 11, 15};
        int target = 9;

        int result[] = obj.twoSums(nums, target);

        System.out.println(Arrays.toString(result));
    }
}