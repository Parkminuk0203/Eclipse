import java.util.*;
public class CH4_221028_2_1 {

	public static void main(String[] args) {
// ����ڷκ��� 5���� ������ �Է¹޾Ƽ� ����� ���ϴ� ���α׷��� �迭�� �̿��Ͽ� �ۼ��Ͽ� ����.
	Scanner sc = new Scanner(System.in);
	final int size = 5;
	int[] student = new int[size];
	int sum = 0;
	
	for(int i=0; i<student.length; i++) {
		System.out.print("������ �Է��Ͻÿ�:");
		student[i] = sc.nextInt();
		sum+=student[i];
	}
	System.out.println("��� ������ " + sum/size + "�Դϴ�.");
	
	}

}
