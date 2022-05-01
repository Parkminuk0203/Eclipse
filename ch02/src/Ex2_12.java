
public class Ex2_12 {

	public static void main(String[] args) {
		String str = "3";
		System.out.println(str.charAt(0) - '0'); 
//      문자열을 문자로 변환
//		문자열을 문자로 변환하고 문자에서 '0'을 뺀다.
//   	숫자 3이 됨
//		3
		System.out.println('3' - '0' - 1); 
//		문자를 숫자로 변환
//		2
		System.out.println(Integer.parseInt("3") + 1);
//		문자열을 숫자로 변환
//		4
		System.out.println("3" + 1);
//		숫자를 문자열로 변환
//		31
		System.out.println((char)(3 + '0'));
//      숫자를 문자로 변환 - 숫자에 '0'을 더한다.
//		3
	}

}
