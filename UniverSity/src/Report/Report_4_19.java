package Report;
import java.util.*;

public class Report_4_19 {

	public static void main(String[] args) {
//		19. 입력값들의 분포를 시각적으로 볼 수 있는 히스토그램을 만드는 프로그램을 작성하시오. 
//		이 프로그램은 1과 100사이의 정수 10개를 읽어야 하고 1-10, 
//		11-20 등의 범위에 드는 값들의 횟수를 아래 그림과 같이 출력하여야 한다.
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[10];
		int[] num = new int[10];
		int i,j;
		
		for (i = 0; i < 10; i++) {
			System.out.println((i + 1) + "번째 값: ");
			num[i] = sc.nextInt();
		} // 배열 num에 1-100개 정수 10개를 입력받는다.
		for (i = 0; i < 10; i++) {
			arr[i] = ((i * 10) + 1) + "-" + ((i + 1) * 10) + ":";
		}
		// arr의 0번째 인덱스에 값의 범위를 표시하는 String을 넣는다.
		for (i = 0; i < 10; i++)
			for (j = 0; j < 10; j++)
				if ((i * 10) + 1 <= num[j] && num[j] <= (i + 1) * 10)
					arr[i] += "*";
		// 배열 num의 인덱스의 값에 따라 배열arr에 ‘*’를 넣는다.
		for (i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		} // 배열 arr을 출력한다.

	} // end of main
} // end of class