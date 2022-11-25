package Report;

import java.util.*;

public class Report_4_21_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("16진수 문자열 입력 : ");
		String s = sc.next();
		
		String[] hexa2bin = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		
		int i=0;
		for(i=0;i<s.length();i++) {
			char c = s.charAt(i);
			int index = 0;
			if(c>='0' && c<='9') {
				index = (c-'0');
			}
			if(c>='a' && c<='f') {
				index = 10 + (c-'a');
			}
		}
		
	} // end of main
} // end of class