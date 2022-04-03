
public class Ex4_16 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
//		while(sum <= 100) {     if(sum > 100)을 생략하고 이렇게도 가능함
		while(true) { // 무한 반복문, for(;;){}은 생략 가능한데 while은 생략하면 Error 남.
			if(sum > 100)
				break; // 자신이 속한 하나의 반복문을 벗어난다.
		++i; 	// 값이 참조되기전에 증가함, break문이 수행되면 이 부분은 실행되지않고 벗어남
		sum += i; // sum = sum + i, break문이 수행되면 이 부분은 실행되지않고 벗어남
		} // end of while
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	} // end of main
} // end of class
