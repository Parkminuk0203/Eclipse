import java.util.*;
public class D221007_6 {

	public static void main(String[] args) {
		// ������ ������ �� ��������
		int i=1;
		while (i <= 9) {
			int j=2;
			while (j <= 9) {
				System.out.printf("%d*%d=%d\t",j,i,i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	} // end of main

} // end of class
