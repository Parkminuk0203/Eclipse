import java.util.*;
public class D220930_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		모음과 자음 구분
		
		String str;
		
		System.out.println("영문자를 대문자로 입력하시오: ");
		str = sc.next();
		
		switch (str) {
		
		case "A" :
			System.out.println("모음");
			break;
		case "E" :	
			System.out.println("모음");
			break;
		case "I" :
			System.out.println("모음");
			break;
		case "O" :
			System.out.println("모음");
			break;
		case "U" :
			System.out.println("모음");
			break;
		default :
			System.out.println("자음");
		}
	
	} // end of main

} // end of class
