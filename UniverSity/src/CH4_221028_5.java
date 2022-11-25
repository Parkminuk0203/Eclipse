import java.util.*;
public class CH4_221028_5 {

	public static void main(String[] args) {
//	최소값 알고리즘
	int[] s = {12,3,19,6,18,8,12,4,1,19};
	int min = s[0];
	
	for(int i=0;i<s.length; i++) {
		if(s[i] < min) {
			min = s[i];
		}
	}
	System.out.println("최소값:"+min);
	} // end of main
} // end of class
