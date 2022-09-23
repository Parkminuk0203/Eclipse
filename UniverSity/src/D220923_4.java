import java.util.*;
public class D220923_4 {

	public static void main(String[] args) {
//		국어, 영어, 수학의 점수를 입력받아 총점과 평균을 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int input1 = sc.nextInt();
		System.out.println("영어 : ");
		int input2 = sc.nextInt();
		System.out.println("수학 : ");
		int input3 = sc.nextInt();
		
		float avg = (input1 + input2 + input3) / 3;
		System.out.println("-------------");
		System.out.printf("3과목의 평균:%.2f점",avg);
		
	} // end of main

} // end of class
