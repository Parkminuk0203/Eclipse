import java.util.*;
public class CH4_221028_2_3_test {

	public static void main(String[] args) {
// ����ڷκ��� 5���� ������ �Է¹޾Ƽ� ����� ���ϴ� ���α׷��� �迭�� �̿��Ͽ� �ۼ��Ͽ� ����.
	Scanner sc = new Scanner(System.in);
	System.out.print("����� �л�: ");
	final int size = sc.nextInt();
	int[] stu = new int[size];
	double sum = 0;
	
	for(int i=0; i<stu.length; i++) {
		System.out.print((i+1)+"�� �л� ������ �Է��Ͻÿ�:");
		stu[i] = sc.nextInt();
		sum += stu[i];
	}
	System.out.printf("��� ������ %.2f�Դϴ�",(double)sum/size);
	
	} // end of main

} // end of class
