import java.util.*;
public class CH4_221109_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		String[] name = {"홍길동","유관순","이승엽","가나다","이승만"};
		String serch;
		
		for(i=0; i<5; i++) {
			System.out.print(name[i]+"  ");
		}
		System.out.print("\n찾을 사람의 이름 : ");
		serch = sc.next();
		
		for(i=0; i<5; i++) {
			if(name[i].equals(serch)) {
				break;
			}
		}
		if(i<5) {
			System.out.println(serch + "는 " + (i+1) + "번째 사람입니다.");
		}
		else {
			System.out.println(serch + "는 찾을 수 없습니다.");
		}
	} // end of main

} // end of class
