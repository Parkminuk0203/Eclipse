package Report;

import java.util.*;

public class report2_1 {

	public static void main(String[] args) {
//가위바위보 게임을 수행하여 결과를 카운트하는 프로그램을 작성
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int usr = 0, com = 0, com_count = 0, usr_count = 0;

		do {
			com = rnd.nextInt(3) + 1;
			System.out.print("사용자 선택(1:가위, 2:바위, 3:보) : ");
			usr = sc.nextInt();
			System.out.println("컴퓨터 : " + com + " 사용자 : " + usr);

			if (com % 3 == (usr + 1) % 3) {
				System.out.println("컴퓨터가 이겼습니다.");
				com_count++;
			} else if (com == usr) {
				System.out.println("비겼습니다.");
			} else {
				System.out.println("사용자가 이겼습니다.");
				usr_count++;
			}
			System.out.println("스코어 : (컴)" + com_count + " : " + usr_count + "(사용자)");
		} while (com_count < 3 && usr_count < 3);
		if (com_count == 3) {
			System.out.println("***** 컴퓨터 승리 *****");
		} else {
			System.out.println("***** 사용자 승리 *****");
		}

	} // end of main

} // end of class
