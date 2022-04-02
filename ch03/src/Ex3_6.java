
public class Ex3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b); 
		// int / int = int
		// 10 / 4
		// 소수점 이하는 버려진다.
		// 2
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); 
		// int / float = float / float 
		// 10.0f / 4.0f
		// 2.500000
		System.out.println('2' - '0');
	}

}
