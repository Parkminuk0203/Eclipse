package Report;
import java.util.*;
public class report_29 {

	public static void main(String[] args) {
//		17. 1�� ������ x+y+z=10�� �����ϴ� ��� �ظ� ���ϴ� ���α׷��� �ۼ��غ���. 
//			���⼭ x�� y, z�� �����̰� 0<=x<=10, 0<=y<=10, 0<=z<=10�̶�� ��������. 
		for (int x=0; x<=10; x++) {
			for (int y=0; y<=10; y++) {
				for(int z=0; z<=10; z++) {
					if(x+y+z==10) {
						System.out.println("("+x+","+y+","+z+")");
					}
				}
			}
		}
	} // end of main

} // end of class
