package Report;
import java.util.*;
public class report_34 {

	public static void main(String[] args) {
//		22. 다음과 같이 구구단을 출력하는 프로그램을 작성하여 보자. 
		int i = 0;
		int j = 0;

		for (i=1;i<=10;i++) {
			for(j=1;j<=10;j++) { 
				System.out.printf("%-2d ",i*j); 
			}
			System.out.println();
		}
	} // end of main

} // end of class
