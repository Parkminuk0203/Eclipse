import java.util.*;
public class D221007_2 {

	public static void main(String[] args) {
//		100이상의 정수중 짝수만 사용자 입력한 개수만큼 출력
		Scanner sc = new Scanner(System.in);
		
		int c = 0;
		System.out.print("입력할 개수: ");
		int n = sc.nextInt();
		
		for (int i = 100; c < n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				c++;
			}
		}
	} // end of main

} // end of class
