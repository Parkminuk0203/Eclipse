class Ex6_3 {
	public static void main(String args[]) {
		System.out.println("Card.width = " + Card.width);   //Card.width = 100. cv.
		System.out.println("Card.height = " + Card.height); //Card.height = 250. cv.

		Card c1 = new Card(); //객체 생성.
		c1.kind = "Heart";    //iv
		c1.number = 7;  	  //iv

		Card c2 = new Card(); //객체 생성.
		c2.kind = "Spade";    //iv
		c2.number = 4;        //iv

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		//c1은 Heart, 7이며, 크기는 (100, 250)
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		//c2는 Spade, 4이며, 크기는 (100, 250)
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		//c1의 width와 height를 각각 50, 80으로 변경합니다.
		
		Card.width = 50; //c1.width=50;로 하면 iv랑 헷갈릴 수 있어서 클래스 이름을 권장.
		Card.height = 80;//c2.height=80;로 하면 iv랑 헷갈릴 수 있어서 클래스 이름을 권장.

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		//c1은 Heart, 7이며, 크기는 (50, 80)
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		//c2는 Spade, 4이며, 크기는 (50, 80)
	} //end of main
} //end of class

class Card {
	String kind;
	int number;
	static int width = 100; //cv.
	static int height = 250; //cv.
} //end of class