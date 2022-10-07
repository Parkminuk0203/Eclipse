import java.util.*;
public class D221007_8 {

	public static void main(String[] args) {
//		입력 받은 수까지 더해라
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int sum = 0;
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		while (i<=num) {
			sum += i;
			i++;
		}
		System.out.println("합계  : "+sum);
	} // end of main

} // end of class
