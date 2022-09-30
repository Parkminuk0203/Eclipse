import java.util.*;
public class D220930_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month;
		int days;
		
		System.out.println("일수를 알고 싶은 월을 입력하시오:");
		
		month = sc.nextInt();
		
		switch (month) {
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			days = 30;
			break;
		case 2 :
			days = 28;
			break;
		default :
			days = 31;
		}
		System.out.println("월의 날수는 "+days);
	
	} // end of main

} // end of class
