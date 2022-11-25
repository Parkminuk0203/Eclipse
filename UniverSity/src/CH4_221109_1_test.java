import java.util.*;

public class CH4_221109_1_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = { "홍길동", "박민욱", "유관순", "이순신", "손흥민" };
		String serch;
		int i=0;
		// 이름 출력
		for (i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.print("\n찾을 사람의 이름 : ");
		serch = sc.next();

		// 문자열 비교
		for (i = 0; i < name.length; i++) {
			if (name[i].equals(serch))	{
				break;
			}
		}
		if (i < name.length) {
			System.out.println(serch + "는" + (i + 1) + "번째 사람입니다.");
		} else {
			System.out.println(serch + "는 찾을 수 없습니다.");
		}

	} // end of main

} // end of class
