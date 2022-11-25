import java.util.*;
public class CH4_221028_6 {

	public static void main(String[] args) {
//	극장 예약 시스템
	Scanner sc = new Scanner(System.in);
	final int size = 10;
	int[] seats = new int [size];
	int num = 0;

	while (true) {
		System.out.println("------------------------------------");
		for(int i=0; i<seats.length; i++) {
			System.out.print((i+1)+" ");
		}
		System.out.println("\n------------------------------------");
		for(int i=0; i<seats.length; i++) {
			System.out.print(seats[i]+" ");
		}
		System.out.println("\n------------------------------------");
		System.out.print("원하시는 자석번호를 입력하세요(종료는 -1):");
		num = sc.nextInt();
		if(num == -1) {
			break;
		}
		if(seats[num-1]==0) {
			seats[num-1]=1;
			System.out.println("예약되었습니다.");
		}
		else {
			System.out.println("이미 예약된 자리입니다.");
		}
		
	} // end of while
	} // end of main
} // end of class
