//Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

public class NumArray{
    private int [] arrayOfNums = null;

    public NumArray(int[] nums) {
        this.arrayOfNums = nums; 
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        
        for (int k = i; k <= j; k++ ){
            sum += this.arrayOfNums[k];
        }
        return sum;
    }
}

// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);
