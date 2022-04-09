import java.util.Arrays; // Arrays.toString()을 사용하기 위해 추가

public class Ex5_4 {

	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		for (int i=0;i<100;i++) {
			int n = (int)(Math.random()*10); //0~9중의 한 값을 임의로 얻는다.
			//numArr[0]과 numArr[n]의 값을 서로 바꾼다.
			int tmp = numArr[0];			
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		} //end of for
		System.out.println(Arrays.toString(numArr));
	} //end of main
} //end of class
