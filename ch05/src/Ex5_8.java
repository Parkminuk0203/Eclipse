class Ex5_8 {
	public static void main(String[] args) {
		int[][] score = {
				  { 100, 100, 100 }
				, { 20, 20, 20 }
				, { 30, 30, 30 }
				, { 40, 40, 40 }
		};
		int sum = 0;
		
		//2차원배열은 다중 for문을 쓰기 때문에 외워놓으면 좋다.
		for (int i = 0; i < score.length; i++) { //score.length는 4행이라 4다.
			for (int j = 0; j < score[i].length; j++) { //score[i].length는 3열이라 3이다.
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

				sum += score[i][j];
			}
		} //end of for

		System.out.println("sum=" + sum);
	} //end of main
} //end of class