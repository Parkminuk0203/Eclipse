import java.util.*;
public class CH4_221028_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String[] toppings = { "Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon" };
//		toppings[3] = sc.next();
//		toppings[4] = sc.next(); // next는 스페이스로 구분되어서 3번에 스페이스 입력하면 4번에 넘어가짐
//		toppings[4] = sc.nextLine(); // 띄어쓰기도 허용 엔터 칠때 까지 입력 받음
		String[] toppings = new String[5];
		
		for (int i=0; i < toppings.length; i++) {
			System.out.print((i+1) + "번 메뉴 : ");
			toppings[i] = sc.nextLine();
		}
		for (int i=0; i < toppings.length; i++) {
			System.out.print(toppings[i]+" ");
		}
	} // end of main

} // end of class
