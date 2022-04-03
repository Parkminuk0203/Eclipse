
public class Ex4_17 {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if (i%3==0) // 3의 배수
				continue;
			System.out.println(i); // 1,2,4,5,7,8,10 출력, 3,6,9는 for문을 벗어남.
		} // end of for
	} // end of main
} // end of class
