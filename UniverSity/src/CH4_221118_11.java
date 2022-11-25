import java.util.*;

public class CH4_221118_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.print("원하는 숫자 개수 입력 : ");
		final int size = sc.nextInt();
		int odd=0, even=0, num=0, tmp=0, i=0, j=0;
		double avg=0;
		
		int[] arr = new int[size];
		int[] arr2 = new int[size];
		
 		// 난수 생성
		for(i=0; i<arr.length; i++) {
			arr[i] = rnd.nextInt(101);
			if(arr[i]%2==0) {
				even += arr[i];
			} else {
				odd += arr[i];
			}
			avg += arr[i];
		} // end of for1
	
		Arrays.sort(arr); // 오름차순
		// 내림차순 알고리즘
		for(i=0, j=size-1; i<j; i++, j--) {
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		System.out.print("\n배열 내용 : ");
		for(int data : arr) {
			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println("홀수의 합 : " + odd + " ");
		System.out.println("짝수의 합 : " + even + " ");
		

	} // end of main

} // end of class