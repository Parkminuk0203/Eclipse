
public class Ex3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
//		10 + 4 = 14
		System.out.printf("%d - %d = %d%n", a, b, a - b);
//		10 - 4 = 6
		System.out.printf("%d * %d = %d%n", a, b, a * b);
//		10 * 4 = 40
		System.out.printf("%d / %d = %d%n", a, b, a / b); 
//		10 / 4 = 2
//      int / int = int
// 		10 / 4
// 		소수점 이하는 버려진다.
// 		2
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
//		10 / 4.000000 = 2.500000
// 		int / float = float / float 
// 		10.0f / 4.0f
		System.out.println('2' - '0');
//		2
	}

}
