public class Ex3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_000; // 1,000,000 1백만 = 10의 6제곱
		int b = 2_000_000; // 2,000,000 2백만 = 10의 6제곱
		
		// 10의 12제곱. int의 범위는 10의 9제
		long c = a * b;
		
		long d = (long) a * b; 
		
		System.out.println(c); // -1454759936 오버플로우
		System.out.println(d); // 2000000000000
	}

}
