import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
//		입력받은 A와 B분을 분으로 변화하는 과정
//      min = 60 * 시 + 분
		int min = 60 * A + B; 
//	       요리하는데 걸린 시간 더하기
		min += C;
		
//		24시 이상이 될 경우 0시 부터 시작
		int hour = (min/60) % 24;
//		분
		int minute = min % 60;
		
		System.out.println(hour+" "+minute);
		
		
	}
}
