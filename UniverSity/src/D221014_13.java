import java.util.*;
public class D221014_13 {

	public static void main(String[] args) {
//	2. 별의 개수를 정하는 1~20까지의 난수를 생성하여  별그래프를 그려보아라.
	Random rnd = new Random();
	
	int num,i,k = 0;
	num = rnd.nextInt(20)+1;
	
	for(k=1;k<=5;k++) {
		for(i=1;i<=num;i++) {
			System.out.print(num+": ");			
		}
		for(i=1;i<=num;i++) {
			System.out.print("*");
		}
	}
	
	} // end of main

} // end of class
