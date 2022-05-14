public class Ex6_14 {
	static {
		System.out.println("static { } ");
//		static { } 
	} // 클래스 초기화 블럭
	
	{	
		System.out.println("{ }");
//		{ }
	} // 인스턴스 초기화 블럭
	
	public Ex6_14() {
		System.out.println("생성자");
//		생성자
	}
	
	public static void main(String[] args) {
		System.out.println("Ex6_14 bt = new Ex6_14(); ");
//		Ex6_14 bt = new Ex6_14(); 
		Ex6_14 bt = new Ex6_14();
		
		System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
//		Ex6_14 bt2 = new Ex6_14(); 
		Ex6_14 bt2 = new Ex6_14();
	} // end of main
} // end of class
//출력순서
//static { } 
//Ex6_14 bt = new Ex6_14(); 
//{ }
//생성자
//Ex6_14 bt2 = new Ex6_14(); 
//{ }
//생성자

//Ex6_14이 메모리에 로딩될 때, 클래스 초기화 블럭이 가장 먼저 수행되어 static {}이 화면에 출력
//그 다음에