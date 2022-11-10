package Report;
import java.util.*;

public class Report_4_14 {

	public static void main(String[] args) {
//		14. Arrays 클래스의 sort()를 사용하면 배열 요소들을 크기 순으로 정렬할 수 있다. 
//		또 Arrays 클래스의 binarySearch()을 이용하면 특정한 값을 탐색할 수 있다. 
//		{ 9, 8, 7, 6, 5, 4, 3, 2, 1 }의 값을 가지는 배열을 생성하고 배열을 정렬하고 
//		3을 탐색하는 코드를 작성해보자.
		int i;
		
		int[] array = {9,8,7,6,5,4,3,2,1};
		Arrays.sort(array);
		for(i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("3의 위치: " + Arrays.binarySearch(array, 3));
		
	} // end of main
} // end of class