package Report;
import java.util.*;

public class Report_4_18 {

	public static void main(String[] args) {
//		18. ī�带 �����ϰ� �����Ͽ� ȭ�鿡 ����ϴ� �ڵ带 �ۼ��غ���. 
//		{ "Clubs", "Diamonds","Hearts", "Spades" } ��
//		{ "2", "3", "4", "5", "6", "7", "8", "9", "10", 
//		"Jack", "Queen","King", "Ace" }�� ������ �ִ� ���ڿ� �迭�� �����ϰ� 
//		�̰͵�κ��� �����ϰ� �ϳ��� ī�带 �����ϴ� �ڵ带 �ۼ��϶�.
		
		Random rnd = new Random();
		String[] arr1 = {"clubs", "Diamonds", "Hearts", "Spades"};
		String[] arr2 = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		int shape1 = rnd.nextInt(arr1.length);
		int shape2 = rnd.nextInt(arr2.length);
		
		System.out.printf("%s�� %s",arr1[shape1],arr2[shape2]);
		
		
		
		
		
		
	} // end of main
} // end of class