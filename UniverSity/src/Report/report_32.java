package Report;
import java.util.*;
public class report_32 {

	public static void main(String[] args) {
//		20. 2�� 100 ���̿� �ִ� ��� �Ҽ�(prime number)�� ã�� ���α׷��� �ۼ��϶�. 
//		�־��� ���� k�� 2���� k-1������ ���ڷ� ����� �������� 0�� ���� �ϳ��� ������ 
//		�Ҽ��� �ƴϴ�.
		for (int Primenum=2; Primenum <= 100; Primenum++) { 	
				int count = 0;
			for (int k=2; k<=Primenum; k++ ) { 
				if (Primenum%k==0) {
					count++;					
				}
			}
		if (count == 1) {
			System.out.println(Primenum);
		}
		}
	} // end of main

} // end of class
