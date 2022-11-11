import java.util.*;

public class CH4_221111_2 {

	public static void main(String[] args) {
		// 로또
		Random rnd = new Random();
		int[] lotto = new int[6];
		int[] freq = new int[46];
		
		System.out.println("===== 로또 복권번호 생성 =====");
		
		int i=0;
		for(i=0;i<lotto.length;i++) {
			lotto[i] = rnd.nextInt(45)+1;
			if(freq[lotto[i]]==1) {
				i--;		
			}
			else {
				freq[lotto[i]] = 1;
			}
		}
		for(i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
	} // end of main

} // end of class