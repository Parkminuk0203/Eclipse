
public class Ex3_8 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);
		System.out.println(c);
//		44
//		10 * 30 = 300이지만 300은 byte형의 범위를 넘어 데이터 손실이 발생하여 44가 나옴
	}
}
