
public class Ex3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = Math.round(4.52); // result가 5가 됨
		
		double pi = 3.141592;
		
		System.out.println(result); // 5
		System.out.println(pi); // 3.141592
		System.out.println(pi * 1000); // 3141.592
		System.out.println(Math.round(pi*1000)); // 3142
		
		System.out.println(Math.round(pi*1000)/1000); 
		// int(3142) / int(1000) 
		// 3142 / 1000
		// 3
		
		System.out.println(Math.round(pi*1000)/1000.0); // 3.142
		// int(3142) / double(1000.0)
		// 3142.0 / 1000.0
		// 3.142
		
		System.out.println((double)Math.round(pi*1000)/1000); // 3.1424
		
		double shortPi = Math.round(pi * 1000) / 1000.0;
		// Math.round(3.141592 * 1000) / 1000.0
		// Math.round(3141.592) / 1000.0
		// 3142 / 1000.0
		System.out.println(shortPi); // 3.142
	}

}
