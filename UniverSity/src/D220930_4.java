import java.util.*;
public class D220930_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score, number;
		char grade;
		
		System.out.println("성적을 입력하시오: ");
		score = sc.nextInt();
		number = score / 10;
		
		switch (number) {
		
		case 10 :
			
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default :
			grade = 'F';
			break;	
		} // end of switch
		
		System.out.println("학점: " + grade);
		
	
	} // end of main

} // end of class
