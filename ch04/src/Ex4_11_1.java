
public class Ex4_11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		// 비효율적
		
		for(int i=1;i<=5;i++) {                    // i=1,2,3,4,5번 {}안의 내용을 반복
			System.out.println("**********");
		}
		// 첫번째 
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.printf("*");
		}
			System.out.println();
		}
		// 중첩 for문 사용
	}

}
