/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

   @gouthami.504@gmail.com
 */



package in.ineuron;

public class TestApp {
	
	   public static void moveZeroes(int[] nums) {
	        int i = 0; // Pointer to track the position to place non-zero elements

	        // Traverse the array and move non-zero elements to the front
	        for (int num : nums) {
	            if (num != 0) {
	                nums[i] = num;
	                i++;
	            }
	        }

	        // Fill the remaining positions with zeros
	        while (i < nums.length) {
	            nums[i] = 0;
	            i++;
	        }
	    }

	    public static void main(String[] args) {
	        int[] nums = {0, 1, 0, 3, 12};
	        moveZeroes(nums);

	        System.out.print("Result: ");
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }
	    }
	}

