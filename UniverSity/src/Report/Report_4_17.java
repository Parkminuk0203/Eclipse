package Report;
import java.util.*;

public class Report_4_17 {

	public static void main(String[] args) {
//		17. 2���� 3���� ���͸� �޾Ƽ� ����(dot product)�� ����ϴ� ���α׷��� �ۼ��϶�. 
//		���ʹ� ������ �߻��Ͽ��� �����Ѵ�.
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
		System.out.println("������ ����: " + dot_product);
	} // end of main
} // end of class