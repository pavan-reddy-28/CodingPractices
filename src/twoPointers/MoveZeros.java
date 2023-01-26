package twoPointers;

import java.util.Arrays;

//Given an integer array nums, move all 0's to the end of it 
//while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
//
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

public class MoveZeros {
	 public void moveZeroes(int[] nums) {
		 int i=0,j=i+1;
		 while(j<nums.length) {
			 if(nums[i]==0) {
				 if(nums[j]==0) {
					 j++;
				 }else {
					 nums[i] = nums[j];
					 nums[j]=0;
					 i++;
					 j++;
				 }
			 }else {
				 i++;
				 j++;
			 }
		 }
		 Arrays.stream(nums).forEach(x->System.out.print(" - "+x));
//		 int startIndex =0, endIndex = nums.length -1 ;
//		 
//		 while(startIndex <= endIndex ) {
////			 Arrays.stream(nums).forEach(x->System.out.print(" - "+x));
//				
//			 if( nums[startIndex] == 0 && nums[endIndex] != 0) {
//				 nums[startIndex] =  nums[endIndex];
//				 nums[endIndex] = 0;
//				 startIndex++;
//				 endIndex--;
//				 
//			 }else if(nums[startIndex] == 0 && nums[endIndex] == 0) {
//				 endIndex--;
//			 }else {
//				 startIndex++;
//			 }
//		 }
//		 Arrays.stream(nums).forEach(x->System.out.print(" - "+x));
		 
		 
		 
		 /*
		  * 
		  * i=0 j =i+1
		  
		  a[i] = 0
		  check a[j]
		  if a[j]=0 , move j=j+1
		  else 
		  a[i] = a[j]
		  a[j]=0
		  i++;
		  j++;
		  
		  {0,1,0,3,12}
		  i=0
		  j=1
		  a[i] == 0 yes
		  a[j] ==0 no
		  	a[i] = a[j]
		  	a[j] = 0
		  	i++
		  	j++
		 {1,0,0,3,12}
		 ------------
		 i=1
		 j=2
		 a[i]==0 yes
		 a[j] ==0 yes
		 	j++
		 {1,0,0,3,12}
		 ----------
		 i=1
		 j=3
		 a[i] ==0 yes
		 a[j] ==0 no
		 	a[i] = a[j]
		  	a[j] = 0
		  	i++
		  	j++
		 {1,3,0,0,12}
		 --------
		 i=2
		 j=4
		 a[i]==0 yes
		 a[j] ==0 no 
			a[i] = a[j]
			a[j] = 0
			i++
			j++
		 {1,3,12,0,0}
		 ----
		 i=3
		 j=5
		 
		 
		  
		  */
		 
		 
		 
		 
		 
		 
		 
	    }
	 
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZeros obj = new MoveZeros();
		int nums[] = {0,1,0,3,12};
		obj.moveZeroes(nums);
		
	}

}
