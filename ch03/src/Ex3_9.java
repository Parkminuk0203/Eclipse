public class Ex3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_000; // 1,000,000 1�鸸 = 10�� 6����
		int b = 2_000_000; // 2,000,000 2�鸸 = 10�� 6����
		
		// 10�� 12����. int�� ������ 10�� 9��
		long c = a * b;
		
		long d = (long) a * b; 
		
		System.out.println(c); // -1454759936 �����÷ο�
		System.out.println(d); // 2000000000000
	}

}
