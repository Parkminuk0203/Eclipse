import java.util.*;
public class Backjoon10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
			
		Arrays.sort(arr);
//		arr[0] 인덱스의 값은 최소값
//		arr[i]-1의 값은 최대값
		System.out.println(arr[0]+" "+arr[num-1]);
	}

}
