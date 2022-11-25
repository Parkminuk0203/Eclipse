package Report;
import java.util.*;

public class report_bingo_1 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[][] bingo = new int[5][5]; // 5*5ũ���� 2���� �迭 ����
		int[] freq = new int[26]; // �ߺ� ���Ÿ� ���� 1���� �迭
		int i = 0, j = 0, num = 0;

		// �ߺ��� �� ����
		for (i = 0; i < bingo.length; i++) {
			for (j = 0; j < bingo[i].length; j++) {
				num = rnd.nextInt(25) + 1; // 1~25�� ���� ����
				if (freq[num] == 0) { // ���� freq[num]�� 0�� ������
					freq[num] = 1; // freq[num] ���� 1�� �ٲٰ�
					bingo[i][j] = num; // num�� ���� ���� ���� 2���� ���� �迭�� �����Ѵ�.
				} else { // �ƴϸ�
					j--; // j--�� �Ͽ� �ߺ��� �ѹ� �� ����
				}
			} // end of for j
		} // end of for k
		
		// �迭 ���
		System.out.println("----------------");
		for (i = 0; i < bingo.length; i++) {
			System.out.print("|");
			for (j = 0; j < bingo[i].length; j++) {
				System.out.printf("%-2d|",bingo[i][j]);
			} // end of for j
			System.out.println();
			System.out.println("----------------");
		} // end of for k

	} // end of main
} // end of class
