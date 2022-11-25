import java.util.*;
public class CH4_221028_2_3_test {

	public static void main(String[] args) {
// 사용자로부터 5명의 성적을 입력받아서 평균을 구하는 프로그램을 배열을 이용하여 작성하여 보자.
	Scanner sc = new Scanner(System.in);
	System.out.print("몇명의 학생: ");
	final int size = sc.nextInt();
	int[] stu = new int[size];
	double sum = 0;
	
	for(int i=0; i<stu.length; i++) {
		System.out.print((i+1)+"번 학생 성적을 입력하시오:");
		stu[i] = sc.nextInt();
		sum += stu[i];
	}
	System.out.printf("평균 성적은 %.2f입니다",(double)sum/size);
	
	} // end of main

} // end of class
