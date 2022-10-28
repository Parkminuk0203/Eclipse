import java.util.*;
public class CH4_221028_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] x = new double[5];
		
		for (int i=0; i < x.length; i++) {
			System.out.print((i+1) + "번 실수 입력 : ");
			x[i] = sc.nextDouble();
		}
		for (int i=0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
	} // end of main

} // end of class
