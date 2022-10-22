import java.util.*;

public class D221014_14 {

	public static void main(String[] args) {
//	5. 사용자와 컴퓨터가 가위바위보 게임을 다음과 같이 진행하도록 프로그래밍 하시오.
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int user, computer = 0;
		System.out.println("사용자 입력(1: 가위, 2: 바위, 3: 보): ");
		user = sc.nextInt();
		computer = rnd.nextInt(3) + 1;

		while (true) {
			if (user == 1 && computer == 1) {
				System.out.println("사용자: 가위, 컴퓨터: 가위, \n비겼습니다.");
				break;
			} else if (user == 1 && computer == 2) {
				System.out.println("사용자: 가위, 컴퓨터: 바위, \n졌습니다.");
				break;
			} else if (user == 1 && computer == 3) {
				System.out.println("사용자: 가위, 컴퓨터: 보, \n이겼습니다.");
				break;
			}
			if (user == 2 && computer == 2) {
				System.out.println("사용자: 바위, 컴퓨터: 바위, \n비겼습니다.");
				break;
			} else if (user == 2 && computer == 1) {
				System.out.println("사용자: 바위, 컴퓨터: 가위, \n이겼습니다.");
				break;
			} else if (user == 2 && computer == 3) {
				System.out.println("사용자: 바위, 컴퓨터: 보, \n졌습니다.");
				break;
			}
			if (user == 3 && computer == 3) {
				System.out.println("사용자: 보, 컴퓨터: 보, \n비겼습니다.");
				break;
			} else if (user == 3 && computer == 1) {
				System.out.println("사용자: 보, 컴퓨터: 가위, \n졌습니다.");
				break;
			} else if (user == 3 && computer == 2) {
				System.out.println("사용자: 보, 컴퓨터: 바위, \n이겼습니다.");
				break;
			}
		}

	} // end of main

} // end of class
