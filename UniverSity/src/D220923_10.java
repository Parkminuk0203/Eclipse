import java.util.*;
public class D220923_10 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		
		System.out.println("현재 시간은 " + date);
		if (hour < 11) {
			System.out.println("Good morning");
		} else if (hour < 15) {
			System.out.println("Good afternoon");
		} else if (hour < 20) {
			System.out.println("Good evening");
		} else {
			System.out.println("Good night");
		}
		
	} // end of main

} // end of class
