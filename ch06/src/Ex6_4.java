class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath(); // MyMath 객체 생성.
//		mm.printGugudan(3); // 구구단 3단을 출력. 10단을 출력하려고 하면 실행되지 않음.
		long result = mm.max(5,3);
		long result1 = mm.add(5L, 3L); // add메서드 호출.
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);

		System.out.println("max(5, 3) = " + result); 
//		max(5, 3) = 5
		System.out.println("add(5L, 3L) = " + result1); 
//		add(5L, 3L) = 8
		System.out.println("subtract(5L, 3L) = " + result2); 
//		subtract(5L, 3L) = 2
		System.out.println("multiply(5L, 3L) = " + result3); 
//		multiply(5L, 3L) = 15
		System.out.println("divide(5L, 3L) = " + result4); 
//   	divide(5L, 3L) = 1.6666666666666667
	} // end of main
 } // end of class

 class MyMath {
	void printGugudan(int dan) {
		if(!(2<=dan && dan <=9))
			return; // 입력받은 단(dan)이 2~9가 아니면, 메서드 종료하고 돌아가기.
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		} // end of for
//			return; //생략 가능.
	} // end of void
	
	long add(long a, long b) {
		long result = a + b;
		return result;
	//	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	
	// 두 값을 받아서 둘 중에 큰 값으로 반환하는 메서드를 작성하시오.
	long max(long a, long b) {
		return a > b ? a : b;
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
 } // end of class