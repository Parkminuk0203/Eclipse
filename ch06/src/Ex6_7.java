class Data2 { int x; }

class Ex6_7 {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x); 
//		main() : x = 10

		change(d);
		System.out.println("After change(d)"); 
//		After change(d)
		System.out.println("main() : x = " + d.x); 
//		main() : x = 1000
	}

	static void change(Data2 d) { // 참조형 매개변수 (읽고 쓰기 가능)
		d.x = 1000;
		System.out.println("change() : x = " + d.x); 
//		change() : x = 1000
	}
}