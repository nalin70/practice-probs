// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] x = new int[2];
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    x[0] = i;
                    x[1] = j;
                }
            }

        }
        return x;
    }
}
