import java.util.*;

public class ch4_18 {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) { // 무한 반복문
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");
			
			String tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break; // while문 탈출
			} else if (!(1 <= menu && menu <=3)) { 
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue; // 1 ~ 3이 아닌 수를 입력하였을때 반복
			} // end of else if
			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
		}// end of while
	} // end of main
} // end of class
