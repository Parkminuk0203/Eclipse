import java.util.*;
public class D221007_13 {

	public static void main(String[] args) {
//		1~100���� ¦�� ��� �� ��
		int i = 0;
		int sum = 0;
		
		for (i=1;i<=100;i++) {
			if (i % 2 == 0) {
				System.out.println(i);			
				sum += i;
			}
		}
		System.out.println("��:"+sum);
	} // end of main

} // end of class
