import java.util.*;

public class CH4_221118_8 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[][] array = new int[3][5];
		int[] row = new int[3];
		int[] col = new int[5];

		// ���� ����
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(101);
			}
		}
		// �迭 ���
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%4d",array[i][j]);
				row[i] += array[i][j];
				col[j] += array[i][j];
			}
			System.out.println("   (" + row[i] + ")");
		}
		for(int data : col) {
			System.out.print(" (" + data + ")");
		}
	} // end of main

} // end of class