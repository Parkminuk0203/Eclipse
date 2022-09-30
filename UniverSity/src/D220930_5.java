import java.util.*;
public class D220930_5 {

	public static void main(String[] args) {
//		월의 일수를 출력
		Scanner sc = new Scanner(System.in);
		
		String month;
		int monthnumber;
		
		System.out.println("월의 이름을 입력하시오.");
		month = sc.next(); // 입력받은 값을 문자열로 받음
		
		switch (month) {
		case "january" :
			monthnumber = 1;
			break;
		case "february" :
			monthnumber = 2;
			break;
		case "march" :
			monthnumber = 3;
			break;
		default :
			monthnumber = 0;
		}
		System.out.println(monthnumber);
			
		
	
	} // end of main

} // end of class
