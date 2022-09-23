import java.util.*;
public class Backjoon2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
//		서로 다른 9개의 자연수를 받아야해서 9길이에 배열 선언
		int max = 0;
		int index = 0;
		
//		숫자를 입력받아 배열을 만드는 반복문
		for(int i=0;i<9;i++) {
			int input = sc.nextInt();
			num[i] = input;
		} // end of for 1
		
//		index 값을 구하기 위한 반복문
		for(int i=0;i<9;i++) {
			if(num[i]>max) {
				max = num[i];
				index = i+1;
//	       요구하는 자리값이 1~9까지니까 인덱스번호에 1를 더해주어야한다.
			} // end of if
		} // end of for2
		System.out.println(max);
		System.out.println(index);
	} // end of main
} //end of class
