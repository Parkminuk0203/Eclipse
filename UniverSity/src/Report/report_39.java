package Report;
import java.util.*;
public class report_39 {
	
	public static void main(String[] args) {
//		25. (1 + 1/2 + 1/3 + ... + 1/n ) 과 같은 조화 수열의 합을 계산하는 프로그램을 작성하여 보자. 
//		n이 무한대가 되면 수열의 합은 어떻게 될까?-> 무한대가 됨! 조화 수열의 각 항은 점차
//		작아져서 0에 한없이 가까워지지만 그 역수의 합은 무한대가 된다. 
		Scanner sc = new Scanner(System.in);
		double i = 0;
		double sum = 0;
		double n = 0;

		System.out.print("n를 입력하시오: ");
		n = sc.nextDouble();
		
		for (i=1; i<=n; i++) {
			sum += 1/i;
		}
		System.out.println(sum);
	}
	
}