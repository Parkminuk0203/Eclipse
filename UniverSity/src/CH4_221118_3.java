import java.util.*;

public class CH4_221118_3 {

	public static void main(String[] args) {
//		완전수 구하기
		int i=0, j=0, sum=0;
		for(i=1; i<=1000; i++) {
			sum=0;
			for(j=1; j<i; j++) {
				if(i%j==0) {
					sum+=j;
				}
		}
		}
		if(i == sum) {
			System.out.println(sum);
		}
		System.out.println("약수의 합:"+sum);
	} // end of main

} // end of class