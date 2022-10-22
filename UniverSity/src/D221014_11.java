import java.util.*;
public class D221014_11 {

	public static void main(String[] args) {
//		2. 점수 범위(60~100)의 난수를 생성하여 25개 출력하되, 
//		       한줄에 5개씩 출력되도록 프로그래밍 하세요. (시험 나옴)
		Random rnd = new Random();
		int num = 0;
		int i,j = 0;
		
		System.out.println("*** 점수 출력 ***");
		for (i=1;i<=5;i++) {
			for (j=1;j<=5;j++) {
				num = rnd.nextInt(41)+60;
				System.out.printf("%d ",num);				
			}
			System.out.println();
		}
		
	} // end of main

} // end of class
