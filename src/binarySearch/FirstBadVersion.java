package binarySearch;

public class FirstBadVersion {
	public long firstBadVersion(int n) {
		  long index =0;
		  long start = 1;
		  long end = n;
		int minTrue=0;
		int minWrong=-1;
		System.out.println("start | end | index | minTrue | minWrong ");
		  for(int i =0;i<n;i++){
			 
		      index = (start + end)/2;
		      System.out.print("  "+start+"   |  "+end+"  |  "+index+"    |");
		      //left
		      if(isBadVersion((int)index)){
		          minTrue=(int)index;
		          end=index-1;
		      }else{
		          if(minWrong == index) break;
		          start = index+1;
		          minWrong = (int)index;
		      }
		      System.out.println("  "+minTrue+"      |  "+minWrong+"  ");

		  }



		  return minTrue;
		}
	public boolean isBadVersion(int index) {
		boolean x = false;
		long check =1702766719;
		return index>=check?true:false;
	}
	
	public static void main(String args[]) {
		FirstBadVersion obj = new FirstBadVersion();
		long v = obj.firstBadVersion(2126753390);
		System.out.println("\n \n value ::::: "+v);
	}
	
}
