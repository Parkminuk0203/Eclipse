import java.util.Arrays; //ctrl+shift+o 

public class Ex5_Arrays배열 {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4}; //1차원 배열 arr
		int[][] arr2D = {{11,12},{21,22}}; //2차원 배열 arr2D
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(str2D==str2D2); //false. 참조변수 값 비교
		System.out.println(Arrays.deepEquals(str2D,str2D2)); //true.
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2)); //[0, 1, 2, 3, 4]
		
		int[] arr3 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arr3)); //[2, 3]
		
		int[] arr4 = {3,4,1,0,2};
		System.out.println(Arrays.toString(arr4)); //[3, 4, 1, 0, 2]
		Arrays.sort(arr4); //배열 arr4을 오름차순으로 정렬
		System.out.println(Arrays.toString(arr4)); //[0, 1, 2, 3, 4]
	} //end of main
} //end of class