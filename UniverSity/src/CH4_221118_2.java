import java.util.*;

public class CH4_221118_2 {

	public static void main(String[] args) {
//		��� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int num=0, sum=0;
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		int i=0;
		for(i=1; i<num; i++) {
			if(num%i==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("����� ��:"+sum);
	} // end of main

} // end of class