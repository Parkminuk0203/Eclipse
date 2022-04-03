
public class Ex4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 3; i++) { // i= 1,2,3, 괄호{}안의 문장을 3번 반복
			System.out.println("Hello");
		}
		for (int i = 10; i >= 3; i--) { // i= 1~10
			System.out.println(i);
		}
		for (int i = 1, j = 10; i <= 10; i++, j--) { // i는 for문 안에서만 선언되었기 때문에 밖에선 실행 불가
			System.out.println("i="+i+"j="+j);
		}
//		System.out.println(i); // 선언된 i가 없어서 출력 불가
	}

}
