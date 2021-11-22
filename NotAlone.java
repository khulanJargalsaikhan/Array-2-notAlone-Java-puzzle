package array_2;

import java.util.Arrays;

public class NotAlone {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(notAlone(new int[] {1, 2, 3}, 2)));
		System.out.println(Arrays.toString(notAlone(new int[] {1, 2, 3, 2, 5, 2}, 2)));
		System.out.println(Arrays.toString(notAlone(new int[] {3, 4}, 3)));

	}
	/*
	 * We'll say that an element in an array is "alone" if there are values before and after it, 
	 * and those values are different from it. Return a version of the given array where every 
	 * instance of the given value which is alone is replaced by whichever value to its left or right is larger.

	notAlone([1, 2, 3], 2) 				-- [1, 3, 3]
	notAlone([1, 2, 3, 2, 5, 2], 2) 	-- [1, 3, 3, 5, 5, 2]
	notAlone([3, 4], 3) 				-- [3, 4]
	 */

	
	public static int[] notAlone(int[] nums, int val) {

		int larger = 0;

		for(int i=0; i<nums.length-1; i++){

			if (i > 0 && val == nums[i] && nums[i-1] != nums[i] && nums[i+1] != nums[i]){

				if (nums[i-1] > nums[i+1])
					larger = nums[i-1];
				else
					larger = nums[i+1];

				nums[i] = larger;
			}

		}		  

		return nums;

	}

}
