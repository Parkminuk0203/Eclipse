import java.util.*;

public class CH4_221118_5 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] num = new int[10];
		int i, j, tmp, min;
		for (i = 0; i < 10; i++) {
			num[i] = rnd.nextInt(101); // 0~100Á¡±îÁö
		}
		for (i = 0; i < 10; i++) {
			System.out.print(num[i] + " ");
		}
		for (i = 0; i < 10; i++) {
			min = i;
			for (j = i + 1; j < 10; j++) {
				if (num[min] > num[j]) {
					min = j;
				tmp = num[min];
				num[min] = num[i];
				num[i] = tmp;
				}
			}
		}
		System.out.println();
		for (i = 0; i < 10; i++) {
			System.out.print(num[i] + " ");
		}
	} // end of main

} // end of class