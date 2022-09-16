import java.util.Scanner;
public class 백준_오븐시계 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int hour = (b + c) / 60;
		float min = b % 60;
		
		System.out.println(hour);
		System.out.println(min);
	}
}