package binarySearch;

public class FirstBadVersion {
	public int firstBadVersion(int n) {
		  int index =0;
		  int start = 1;
		  int end = n;
		int minTrue=0;
		int minWrong=-1;
		System.out.println("start | end | index | minTrue | minWrong ");
		  for(int i =0;i<n;i++){
			 
		      index = (start + end)/2;
		      System.out.print("  "+start+"   |  "+end+"  |  "+index+"    |");
		      //left
		      if(isBadVersion(index)){
		          minTrue=index;
		          end=index-1;
		      }else{
		          if(minWrong == index) break;
		          start = index+1;
		          minWrong = index;
		      }
		      System.out.println("  "+minTrue+"      |  "+minWrong+"  ");
		  }



		  return minTrue;
		}
	public boolean isBadVersion(int index) {
		boolean x = false;
		int check =4;
		return index>=check?true:false;
	}
	
	public static void main(String args[]) {
		FirstBadVersion obj = new FirstBadVersion();
		int v = obj.firstBadVersion(5);
		System.out.println("\n \n value ::::: "+v);
	}
	
}
