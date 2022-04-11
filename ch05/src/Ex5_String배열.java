import java.util.Arrays;

public class Ex5_String배열 {

	public static void main(String[] args) {
		String[] strArr = {"가위", "바위", "보"}; //index 0~3-1, 0~2
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0;i<10;i++) {
			int tmp = (int)(Math.random()*3);
		System.out.println(strArr[tmp]);
		} //end of for
	} //end of main
} //end of class