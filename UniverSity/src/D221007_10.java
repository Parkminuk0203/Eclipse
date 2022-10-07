import java.util.*;
public class D221007_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("올바른 월을 입력하시오 [1-12]: ");
			num = sc.nextInt();
		} 
		while (num < 1 || num > 12);
			System.out.println("사용자가 입력한 월은: "+num);			
		
		
	} // end of main

} // end of class
