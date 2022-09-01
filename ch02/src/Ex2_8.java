
public class Ex2_8 {

	public static void main(String[] args) {
		int x = 10, y = 5;
//		int x = 10; int y = 5;를 한 줄로도 가능
		System.out.println("x=" + x);
//		x=10
		System.out.println("y=" + y);
//		y=5
		int tmp = x;
//		정수타입 변수 tmp에 x의 값을 대입
		x = y;
//		y의 값을 x에 저장
		y = tmp;
//		tmp의 값을 y에 저장
		System.out.println("x=" + x);
//		x=5
		System.out.println("y=" + y);
//		y=10
	}

}
