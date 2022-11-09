import java.util.*;
public class CH4_221109_6 {

	public static void main(String[] args) {
		// 극장 예약 시스템
		final int size = 10;
		int[] seat = new int[size];
		int i;
		while (true) {
			System.out.println("----------");
			for(i=0; i<size; i++) {
				System.out.print(i+1 + " ");
			}
			System.out.println("\n----------");
			for(i=0; i<size; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println("\n----------");
			System.out.print("원하시는 자석 번호를 입력하세요(종료는 -1): ");
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			if(s == -1) {
				break;
			}
			if(seat[s-1]==0) {
				seat[s-1]=1;
				System.out.println("예약되었습니다.");
			}
			else {
				System.out.println("이미 예약된 자리입니다.");
			}
		}
	} // end of main

} // end of class