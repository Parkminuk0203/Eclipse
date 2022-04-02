
public class Ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "3";

		System.out.println(str.charAt(0) - '0'); // 숫자 3
		System.out.println('3' - '0' + 1); // 3 + 1 = 숫자 4
		System.out.println(Integer.parseInt(str) + 1); // 3 + 1 = 숫자 4
		System.out.println("3" + 1); // "3" + "1", 문자 31
		System.out.println(3 + '0'); // '0'은 숫자로 48, 3 + 48 = 숫자 51
		System.out.println((char)(3 + '0')); // 문자 3
	}

}
