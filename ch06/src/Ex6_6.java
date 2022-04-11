class Data { int x; }

class Ex6_6 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x); //main() : x = 10

		change(d.x); //d.x = 10
		System.out.println("After change(d.x)");   //After change(d.x)
		System.out.println("main() : x = " + d.x); //main() : x = 10
	}

	static void change(int x) {  //기본형 매개변수 (읽기만 가능)
		x = 1000;
		System.out.println("change() : x = " + x); //change() : x = 1000. 여기서만 1000으로 바뀜.
	}
}