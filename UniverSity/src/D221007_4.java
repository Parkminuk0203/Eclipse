import java.util.*;
public class D221007_4 {

	public static void main(String[] args) {
//		구구단을 입력받아 출력
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		System.out.println("출력하고 싶은 단 : ");
		int num = sc.nextInt();
		
		while (i <= 9) {
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}
		
	} // end of main

} // end of class
