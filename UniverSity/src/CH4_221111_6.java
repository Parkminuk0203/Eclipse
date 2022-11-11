import java.util.*;

public class CH4_221111_6 {

	public static void main(String[] args) {
		// �ζ�
		Random rnd = new Random();
		int[] lotto = new int[6];
		int[] freq = new int[46];

		System.out.println("===== �ζ� ���ǹ�ȣ ���� =====");

		int i = 0;
		for (i = 0; i < lotto.length; i++) {
			lotto[i] = rnd.nextInt(45) + 1;
			if (freq[lotto[i]] == 1) {
				i--;
			} else {
				freq[lotto[i]] = 1;
			}
		}
		// lotto �迭 ����
		int[] lotto_copy = Arrays.copyOf(lotto, lotto.length);
		// for-each�� ����Ͽ� ���
//		for(int value : lotto) {
//			System.out.print(value+" ");
//		}
		for (int value : lotto_copy) {
			System.out.print(value + " ");
		}
		// main() �Ű� ����
	} // end of main

} // end of class