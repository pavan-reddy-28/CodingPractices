package twoPointers;

import java.util.Arrays;

public class TwoSum {
	
	
	public int binarySearch(int numbers[],int start,int target) {
			int index=-1;
			int end = numbers.length-1;
			int i=start;

			for(;i<numbers.length;i++) {
				
				 index = (start+end)/2;
				 
				 if(numbers[index]==target) {
					 break;
				 }	 
				 if(start == end) {
					index = - 1 ;
					break;
				 }
				 if(  target  > numbers[index] ) { //right
					 start = index+1;
				 }else {//right
					 end = index -1;
				 }
				 index=-1;
			}
//			System.out.println("---------------------");
			return index;
		
		
	}
	
	public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        
        for(int i=0;i<numbers.length;i++) {
        	int x = numbers[i];
        	int y = target - x;
//        	System.out.println("start = "+x+"  -   end = "+y);
        	int index = binarySearch(numbers,(i+1),y);
        	
        	if(index !=-1) {
        		result[0] = i+1;
        		result[1] = index+1;
        		break;
        	}
        	
        }
        
        
        return result;
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum obj = new TwoSum();
		int nums[] = {12,13,23,28,43,44,59,60,61,68,70,86,88,92,124,125,136,168,173,173,180,199,212,221,227,230,277,282,306,314,316,321,325,328,336,337,363,365,368,370,370,371,375,384,387,394,400,404,414,422,422,427,430,435,457,493,506,527,531,538,541,546,568,583,585,587,650,652,677,691,730,737,740,751,755,764,778,783,785,789,794,803,809,815,847,858,863,863,874,887,896,916,920,926,927,930,933,957,981,997};
		int target = 542;
		int[] result = obj.twoSum(nums, target);
		
		System.out.println(Arrays.toString(result));
//		System.out.println(nums[24] + " "+nums[32]);
	}

}
