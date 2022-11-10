package Report;
import java.util.*;

public class Report_4_20 {

	public static void main(String[] args) {
//		20. 다음과 같이 학생들의 성적을 받아서 평균을 구하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 수를 입력하시오:");
		final int stu = sc.nextInt();
		int[] arr = new int[stu];
		int i;
		double sum = 0;
		
		for (i=0; i<stu; i++) {
			System.out.printf("학생 %d의 성적을 입력하시오:", i+1);
			int score = sc.nextInt();
			while (0 < score && score > 100) {
				System.out.println("잘못된 성적입니다. 다시입력하시오.");
				System.out.printf("학생 %d의 성적을 입력하시오:", i+1);
				score = sc.nextInt();
			}
			arr[i] = score;
		}
		for (int val : arr) { // arr에서 차례대로 객체를 꺼내서 val의 삽입, arr에서 꺼낼 객체가 없을 때까지 반복
			sum += val;
		}
		System.out.printf("성적 평균은 %.1f입니다.", sum / stu);

	} // end of main
} // end of class