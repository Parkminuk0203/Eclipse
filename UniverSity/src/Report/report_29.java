package Report;
import java.util.*;
public class report_29 {

	public static void main(String[] args) {
//		17. 1차 방정식 x+y+z=10을 만족하는 모든 해를 구하는 프로그램을 작성해보자. 
//			여기서 x와 y, z는 정수이고 0<=x<=10, 0<=y<=10, 0<=z<=10이라고 가정하자. 
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
