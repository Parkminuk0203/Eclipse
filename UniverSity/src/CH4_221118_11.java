import java.util.*;

public class CH4_221118_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.print("���ϴ� ���� ���� �Է� : ");
		final int size = sc.nextInt();
		int odd=0, even=0, num=0, tmp=0, i=0, j=0;
		double avg=0;
		
		int[] arr = new int[size];
		int[] arr2 = new int[size];
		
 		// ���� ����
		for(i=0; i<arr.length; i++) {
			arr[i] = rnd.nextInt(101);
			if(arr[i]%2==0) {
				even += arr[i];
			} else {
				odd += arr[i];
			}
			avg += arr[i];
		} // end of for1
	
		Arrays.sort(arr); // ��������
		// �������� �˰���
		for(i=0, j=size-1; i<j; i++, j--) {
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		System.out.print("\n�迭 ���� : ");
		for(int data : arr) {
			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println("Ȧ���� �� : " + odd + " ");
		System.out.println("¦���� �� : " + even + " ");
		

	} // end of main

} // end of class