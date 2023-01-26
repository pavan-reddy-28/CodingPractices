package twoPointers;

import java.util.Arrays;

public class RotateArray {
	 public void rotate(int[] nums, int k) {
	        while(k>=nums.length ) {
	        	k = k-nums.length;
	        }
	        if(k>0) {
	        	int nArray[] = new int[nums.length];
	        	int index =0;
	        	int check =k;
	        	while(k>0) {
	        		nArray[index] = nums[(nums.length ) - k]; 
	        		index++;
	        		k--;	
	        	}
	        	for(int i = 0;i< nums.length-check;i++) {
	        		nArray[index] = nums[i];
	        		index++;
	        	}
	        		
	        	System.out.println(Arrays.toString(nArray));
	        		
	        }else {
	        	System.out.println(Arrays.toString(nums));
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArray obj = new RotateArray();
		int nums[] = {1,2,3,4,5,6,7};
		int k = 3;
		obj.rotate(nums, k);
		
	}

}
