import java.util.*;

public class CH4_221118_7 {

	public static void main(String[] args) {
		int[][] array = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 } };
		
		for (int i = 0; i < array.length; i++) { // 행의 길이
			for (int j = 0; j < array[i].length; j++) { // 열의 길이
				System.out.println(i + "행" + j + "열" + array[i][j]);
			}
		}

	} // end of main

} // end of class