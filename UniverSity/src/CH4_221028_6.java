import java.util.*;
public class CH4_221028_6 {

	public static void main(String[] args) {
//	���� ���� �ý���
	Scanner sc = new Scanner(System.in);
	final int size = 10;
	int[] seats = new int [size];
	int num = 0;

	while (true) {
		System.out.println("------------------------------------");
		for(int i=0; i<seats.length; i++) {
			System.out.print((i+1)+" ");
		}
		System.out.println("\n------------------------------------");
		for(int i=0; i<seats.length; i++) {
			System.out.print(seats[i]+" ");
		}
		System.out.println("\n------------------------------------");
		System.out.print("���Ͻô� �ڼ���ȣ�� �Է��ϼ���(����� -1):");
		num = sc.nextInt();
		if(num == -1) {
			break;
		}
		if(seats[num-1]==0) {
			seats[num-1]=1;
			System.out.println("����Ǿ����ϴ�.");
		}
		else {
			System.out.println("�̹� ����� �ڸ��Դϴ�.");
		}
		
	} // end of while
	} // end of main
} // end of class
