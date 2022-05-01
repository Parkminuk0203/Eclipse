
public class Ex3_3 {

	public static void main(String[] args) {
		int i=5, j=5;
		System.out.println(i++);
//		5
//		값이 참조되고 증가
		System.out.println(++j);
//		6
//		참조되기 전에 증가
		System.out.println("i = " + i + ", j = " + j);
//		i = 6, j = 6
	}

}
