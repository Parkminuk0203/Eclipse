import java.util.*;
public class CH4_221028_2_1 {

	public static void main(String[] args) {
// 사용자로부터 5명의 성적을 입력받아서 평균을 구하는 프로그램을 배열을 이용하여 작성하여 보자.
	Scanner sc = new Scanner(System.in);
	final int size = 5;
	int[] student = new int[size];
	int sum = 0;
	
	for(int i=0; i<student.length; i++) {
		System.out.print("성적을 입력하시오:");
		student[i] = sc.nextInt();
		sum+=student[i];
	}
	System.out.println("평균 성적은 " + sum/size + "입니다.");
	
	}

}
