
public class VarEx3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean power = true;
		
		byte b = 127; //byte 범위 -128~127
		
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10; // 16진수, 10진수로 16
		
		int i = 2_000_000_000; // int 정수는 +-20억이 최대
		long l = 10_000_000_000L; // 20억이 넘는 것은 L 접두사 사용
		
		float f = 3.14f; // 실수형 접미사 f 생략 불가능
		double d = 3.14; // 실수형 접미사 d 생략 가능
		// 변수와 리터럴 타입이 일치하지 않지만 변수 doble이 리터럴 float보다 값이 커서 가능
		
		System.out.println(power);
		System.out.println(oct);
		System.out.println(hex);
		
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
	}

}
