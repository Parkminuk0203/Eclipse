import java.util.*;

public class test_6 {
	public static void main(String[] args) {
		Random rnd = new Random();

		int r = 0;
		int sum = 0;
		double avr = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				r = rnd.nextInt(100)+1;
				System.out.print(r + " ");
				sum += r;
				avr = sum / 25;
			} // for¹® ¸¶Áö¸·
			System.out.println();

		}
		System.out.printf("ÃÑÇÕ: %d  Æò±Õ : %.2f ", sum, avr);
	}
}