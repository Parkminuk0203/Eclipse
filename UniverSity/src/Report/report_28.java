package Report;
import java.util.*;
public class report_28 {

	public static void main(String[] args) {
//		15. 1�� ������ 3x+10y=100�� �����ϴ� ��� �ظ� ���ϴ� ���α׷��� �ۼ��غ���. 
//		���⼭ x�� y�� �����̰� 0<=x<=10, 0<=y<=10�̶�� ��������.
		
		for (int x = 0; x<=10; x++) {
			for (int y = 0; y<=10; y++) {
				if((3*x) + (y*10) == 100) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	} // end of main

} // end of class
