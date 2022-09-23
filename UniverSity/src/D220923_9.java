import java.util.*;
public class D220923_9 {

	public static void main(String[] args) {
		int score = 0;             
		char grade = ' ';          
		
		System.out.println("성적을  입력하시오: ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt(); 	   // 화면을 통해 입력받은 숫자를 score에 저장
		
		if (score > 100 || score < 0 ) {
		System.out.println("점수를 잘못 입력하셨습니다.");
		} else if (score >=90) {          // score가 90보다 크거나 같으면 A학점
			grade = 'A';
		} else if (score >=80) {   // score가 80보다 크거나 같으면 B학점
			grade = 'B';
		} else if (score >=70) {   // score가 70보다 크거나 같으면 C학점
			grade = 'C';	
		} else {				   
			grade = 'D';           // 그 외 나머지는 D학점
		}
		System.out.println("학점 " + grade);
	}

}
