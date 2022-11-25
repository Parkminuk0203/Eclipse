import java.util.*;

public class CH4_221118_6 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] num = new int[10];
		int[] dec = new int[10];
		
		int i, j, tmp, min;
		
		for (i = 0; i < 10; i++) {
			num[i] = rnd.nextInt(101); // 0~100Á¡±îÁö
		}
		for (i = 0; i < 10; i++) {
			System.out.print(num[i] + " ");
		}
		int[] anc = Arrays.copyOf(num, num.length);
		Arrays.sort(anc);
		
		for(int data: num) {
			System.out.print(data+" ");
		}
		System.out.println();
		for(int data: dec) {
			System.out.print(data+" ");
		}
		System.out.println();
		for(int data: anc) {
			System.out.print(data+" ");
		}
	} // end of main

} // end of class