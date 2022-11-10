package Report;
import java.util.*;

public class Report_4_17 {

	public static void main(String[] args) {
//		17. 2개의 3차원 벡터를 받아서 내적(dot product)을 계산하는 프로그램을 작성하라. 
//		벡터는 난수를 발생하여서 생성한다.
		Random rnd = new Random();
		double[] vector1 = new double[3];
		double[] vector2 = new double[3];
		double dot_product = 0; 
		int i;
		
		for(i=0;i<3;i++) {
			vector1[i] = rnd.nextDouble();
			vector2[i] = rnd.nextDouble();
			dot_product += vector1[i] * vector2[i];
		}
		System.out.println("벡터의 내적: " + dot_product);
	} // end of main
} // end of class