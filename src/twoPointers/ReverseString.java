package twoPointers;

import java.util.Arrays;

public class ReverseString {
	public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;

        while(start<end){
            
            char replace = s[start];
            s[start] = s[end];
            s[end]=replace;
            System.out.println(" new "+s[start] +"    old "+s[end]);
            start++;
            end--;

         }
        System.out.println( Arrays.toString(s));



    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'H','a','n','n','a','h'};
		ReverseString obj = new ReverseString();
		obj.reverseString(s);
	}

}
