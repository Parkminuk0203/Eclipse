
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10/3);
		System.out.printf("age:%d year:%d\n", 14, 2017);
		System.out.println(10.0/3);
		
		System.out.printf("%d%n", 15); // 15
		System.out.printf("%o%n", 15); // 17
		System.out.printf("%x%n", 15); // f
		System.out.printf("%X%n", 15); // F

		
		System.out.printf("%d%n", 15); // 15
		System.out.printf("%#o%n", 15); // 017
		System.out.printf("%#x%n", 15); // 0xf
		System.out.printf("%#X%n", 15); // 0Xf
		System.out.printf("%s%n", Integer.toBinaryString(15)); // 1111
		
		float f = 123.456789f;
		System.out.printf("%f%n", f); // 123.456787, f�� ���е��� 6�ڸ�
		double f1 = 123.456789;
		System.out.printf("%f%n", f1); // 123.456787, d�� ���е��� 15�ڸ�
		System.out.printf("%e%n", f1); // 1.234568e+02
		System.out.printf("%g%n", f1); // 123.457

		System.out.printf("[%5d]%n", 10);  // [   10], 5�ڸ��� ǥ��
		System.out.printf("[%-5d]%n", 10); // [10   ], -�� ���� ����
		System.out.printf("[05d]%n", 10);  // [00010], ���� ��� 0�� ä��
		System.out.printf("[%5d]%n", 1234567);  // [1234567], 5�ڸ��� ǥ�������� 7�ڸ� ��� �����
		
		double d = 1.23456789;
		System.out.printf("%f%n", d); // 1.234568
		System.out.printf("%14.10f%n", d); // [  1.2345678900]
		System.out.printf("%.6f%n", d); // 1.234568
		
		System.out.printf("[%s]%n", "www.codechobo.com"); 	 // [www.codechobo.com]
		System.out.printf("[%20s]%n", "www.codechobo.com");  // [   www.codechobo.com]
		System.out.printf("[%-20s]%n", "www.codechobo.com"); // [www.codechobo.com   ]
		System.out.printf("[%.10s]%n", "www.codechobo.com"); // [www.codech]
		
	}
	
}
