import java.util.*;
public class D220930_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		
		System.out.println("숫자를 입력하시오: ");
		x = sc.nextInt();
		
		switch(x) {
		
		case 0 :
			System.out.println("없음");
			break;
		case 1 :
			System.out.println("하나");
			break;
		case 2 :
			System.out.println("둘");
			break;
		default :
			System.out.println("너무 많습니다.");
		}
	
	} // end of main

} // end of class
