import java.util.*;
public class star_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = n; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
