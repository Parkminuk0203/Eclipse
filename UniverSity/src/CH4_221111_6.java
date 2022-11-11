import java.util.*;

public class CH4_221111_6 {

	public static void main(String[] args) {
		// 로또
		Random rnd = new Random();
		int[] lotto = new int[6];
		int[] freq = new int[46];

		System.out.println("===== 로또 복권번호 생성 =====");

		int i = 0;
		for (i = 0; i < lotto.length; i++) {
			lotto[i] = rnd.nextInt(45) + 1;
			if (freq[lotto[i]] == 1) {
				i--;
			} else {
				freq[lotto[i]] = 1;
			}
		}
		// lotto 배열 복사
		int[] lotto_copy = Arrays.copyOf(lotto, lotto.length);
		// for-each를 사용하여 출력
//		for(int value : lotto) {
//			System.out.print(value+" ");
//		}
		for (int value : lotto_copy) {
			System.out.print(value + " ");
		}
		// main() 매개 변수
	} // end of main

} // end of class