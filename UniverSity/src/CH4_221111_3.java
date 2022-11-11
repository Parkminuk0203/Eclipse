import java.util.*;

public class CH4_221111_3 {

	public static void main(String[] args) {
//	이름과 전화번호를 등록, 검색, 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] ph = new String[10];
		String search;
		int menu = 0, count = 0, i = 0;
		while (true) {

			do {
				System.out.println("===== 간단 주소록 메뉴 =====");
				System.out.println("1. 등록");
				System.out.println("2. 검색");
				System.out.println("3. 출력");
				System.out.println("4. 종료");
				System.out.println("======================");
				System.out.print("- 메뉴 선택 : ");
				menu = sc.nextInt();
			} while (menu < 1 || menu > 4);
			switch (menu) {
			case 1:
				System.out.println("=== 주소록 등록 ===");
				System.out.print("- 등록할 이름 : ");
				name[count] = sc.next();
				System.out.print("- 등록할 전화번호 : ");
				ph[count] = sc.next();
				count++;
				break;
			case 2:
				System.out.print("- 검색할 이름  : ");
				search = sc.next();
				for (i = 0; i < count; i++) {
					if (search.equals(name[i])) {
						System.out.println("- " + search + " 전화번호 : " + ph[i]);
					} else {
						System.out.println(search + "이름은 찾을 수 없습니다.");
					}
				}
				break;
			case 3:
				System.out.println("===== 주소록 출력 =====");
				for (i = 0; i < count; i++) {
					System.out.println(name[i] + " " + ph[i]);
				}
				System.out.print("\n\n\n\n");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(menu == 4) {
				break;
			}
		}
	} // end of main

} // end of class