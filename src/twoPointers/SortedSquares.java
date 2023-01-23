package twoPointers;

import java.util.Arrays;

public class SortedSquares {
	
//	Given an integer array nums sorted in non-decreasing order, 
//	return an array of the squares of each number sorted in non-decreasing order.
	 public int[] sortedSquares(int[] nums) {
		 
		 
	        int newArray[] = new int[nums.length];
	        
	        int minIndex=0;
	        int leftIndex=0,rightIndex=0;
	       
	        
	        
	        //squares
	        for(int i=0;i<nums.length;i++) {
	        	nums[i] = nums[i]*nums[i];
	        }
	      //find min value
	        for(int i=1;i<nums.length;i++) {
	        	if(! (nums[minIndex] < nums[i])) {
	        		minIndex = i;
	        	}
	        }
	        
	        leftIndex = minIndex - 1;
	        rightIndex = minIndex + 1;
	        //rearrange array into newArray
	        newArray[0] = nums[minIndex];
	        minIndex = 1;
	        int index=1;
	        
	        while((index < nums.length)  && (leftIndex >= 0 && rightIndex < nums.length )) {
	        	
	        	if( nums[leftIndex] < nums[rightIndex] ) {
	        		newArray[index] = nums[leftIndex];
//	        		System.out.print(" - "+nums[leftIndex]);
	        		leftIndex--;
	        	}
	        	else if( nums[leftIndex] > nums[rightIndex] ) {
//	        		System.out.print(" - "+nums[rightIndex]);
	        		newArray[index] = nums[rightIndex];
	        		rightIndex++;
	        	}
	        	else {
	        		newArray[ index++ ] = nums[leftIndex];
	        		newArray[ index ] = nums[rightIndex];
	        		leftIndex--;
	        		rightIndex++;
	        	}
	        	index++;
	        }
	        
	        //left
	        while(index < nums.length && leftIndex >= 0 ) {
	        	newArray[index] = nums[leftIndex];
        		leftIndex--;
        		index++;
	        }
	        
	      //right
	        while(index < nums.length && rightIndex < nums.length ) {
	        	newArray[index] = nums[rightIndex];
        		rightIndex++;
        		index++;
	        }
	        
	        
	        
	       
	        
	        
	        
	        return newArray;
	        
	        
	    }
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-4,-1,0,1,4,};
		SortedSquares s = new SortedSquares();
		int newArray[] = s.sortedSquares(nums);
		System.out.println(Arrays.toString(newArray));
		
	}

}
