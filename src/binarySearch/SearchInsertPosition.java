package binarySearch;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
        int index=0;

       int start =0;
       int end =nums.length;
      int breaker =0;
       
       for(int i=0;i<nums.length;i++) {
       	index = ( start + end )/2;
       	
       	
    
       	if(target == nums[index]) {
       		return index;
       	}else if(start==end ) {
       		return index ==0 ? 0 : nums.length;
       	}
       	else if(target > nums[index]) {
       		//right
//       		System.out.println("right >> "+index);
       		start = index +1;
       		if(breaker ==0) {
       			breaker =1;
       		}
       		if(breaker ==-1) {
       			return index +1;
       		}
       		
       	}else {
//       		System.out.println("left >> "+index);
       		end = index-1 ;
       		if(breaker ==0) {
       			breaker =-1;
       		}
       		if(breaker ==1) {
       			return index-1;
       		}
       	}
       	
       }
       
       
       return index;

   }
	
	/*
 
 
 going continously right >> num
 
 going continously left << num
 
 
 */
	
	public static void main(String args[]) {
		SearchInsertPosition obj = new SearchInsertPosition();
		int nums[] = {1,3};
		int target=2;
		System.out.println(obj.searchInsert(nums, target));
	}
}
