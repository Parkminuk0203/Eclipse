
public class D220916_9 {

	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		int k = ++x + y--;
		System.out.println(x);
		System.out.println(y);
		System.out.println(k);
		
		int x1 = 2;
		int y1 = 4;
		int k1 = 3 * (--x1) + y1++;
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(k1);
	} // end of class

} // end of main
