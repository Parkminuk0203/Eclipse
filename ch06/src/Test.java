import java.util.*;
public class Test {
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in); // 화면에서 입력받음
	System.out.println("년도를 입력하세요: ");
	int year = s.nextInt();
	if	((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0 )
		{
		System.out.println("윤년입니다.");
		} //end of if
	else if (year % 100 == 0) {
		System.out.println("평년입니다.");
	} //end of else if문
	else {
		System.out.println("윤년이 아닙니다.");
	} //end of else
	
	} //end of main
} //end of class
