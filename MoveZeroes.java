package excersises;

/*
* Moves zeroes of the array to the end
* of the array.
*/

import java.util.Arrays;
public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
		int j = 0;
		int value = 0;
		for (int i = 0; i < nums.length; i++) {
			value = nums[i];
			for (int k = 0; k < nums.length - 1; k++)
			{	
				if (nums[i] == 0) {
					for (j = i; j < nums.length - 1; j++) {
						nums[j] = nums[j + 1];
					}
					nums[j] = 0;
					//System.out.println(j);
				}
			}	
		}
		System.out.println(Arrays.toString(nums));
	}
}
