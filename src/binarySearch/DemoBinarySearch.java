package binarySearch;

public class DemoBinarySearch {
	
	
	
	public static int binarySearch(int array[],int target) {
		
		int start =0;
		int end = array.length;
		int index = (start+end)/2;
		
		for(int i=0;i<array.length;i++) {
			index = (start+end)/2;
			if(target == array[index]) {
				return index;
			}else if(start == end){
				 return -1;
			}
			if(target>=array[index]) {
				//go right
				start = index;
				end=end;
			}else if(target <= end) {
				//go left
				start=start;
				end=index;
			}
			
			
		}
		
		
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {-4,-1,0,8,25,84};
System.out.println("target = 0 ; = index  "+binarySearch(array,4));
	}

}
