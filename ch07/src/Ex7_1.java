class Tv {
	//Tv의 속성(멤버변수)
	String color;        // 색상
	boolean power;       // 전원상태(on/off)
	int channel;         // 채널
	//Tv의 기능(메서드)
	void power()	{ power = !power; } // TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp()	{ ++channel; }  // TV의 채널을 높이는 기능을 하는 메서드
	void channelDown()	{ --channel; }  // TV의 채널을 낮추는 기능을 하는 메서드
} //end of class

class SmartTv extends Tv {
	boolean caption;
	void displayCaption(String text) { //string 타입의 텍스트가 들어오고
		if (caption) { 				   //만약에 caption이 True이면
			System.out.println("Text");//Text를 출력하라
		} //end of if
	} //end of void
} //end of class

public class Ex7_1 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10; //조상 클래스로부터 상속받은 멤버
		stv.channelUp();  //조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
//		11
		stv.displayCaption("Hello, World"); //caption이 true가 아니므로 출력 X
		System.out.println(stv.caption);
//		false
		stv.caption = true; //캡션(자막) 기능을 켠다.
		stv.displayCaption("Hello, World");
	} //end of main
} //end of class