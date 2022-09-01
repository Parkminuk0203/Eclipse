
public class Ex2_7 {

	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
//		Java
		System.out.println(str);
//		Java8.0
		System.out.println(7 + " ");
//		7
//		문자열 7
		System.out.println(" " + 7);
//		 7
//		문자열 7
		System.out.println(7 + "");
//		7
//		문자열 7
		System.out.println("" + 7);
//		7
//		문자열 7
		System.out.println("" + "");
//
//		빈 문자열
		System.out.println(7 + 7 + "");
//		14
//		7+7을 먼저 더하고 문자열 14로 변환
		System.out.println("" + 7 + 7);
//		77
//		왼쪽에서 부터 식을 수행하기 때문에 문자열 77이 됨
	}
}
