package Report;
import java.util.*;
public class report_32 {

	public static void main(String[] args) {
//		20. 2와 100 사이에 있는 모든 소수(prime number)를 찾는 프로그램을 작성하라. 
//		주어진 정수 k를 2부터 k-1까지의 숫자로 나누어서 나머지가 0인 것이 하나라도 있으면 
//		소수가 아니다.
		for (int Primenum=2; Primenum <= 100; Primenum++) { 	
				int count = 0;
			for (int k=2; k<=Primenum; k++ ) { 
				if (Primenum%k==0) {
					count++;					
				}
			}
		if (count == 1) {
			System.out.println(Primenum);
		}
		}
	} // end of main

} // end of class
