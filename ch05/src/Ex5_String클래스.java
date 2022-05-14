
public class Ex5_String클래스 {

	public static void main(String[] args) {
		String str = "ABCDE"; //index 01234, str.length()는 5
		char ch = str.charAt(2);
		System.out.println(ch); //C
		
		String str2 = str.substring(1,4); //index 1~4까지 가져옴. 4는 생략
		System.out.println(str2); //BCD
		
		String str3 = str.substring(1); //index 1~문자열 끝까지
		System.out.println(str3); //BCDE
		
		String str4 =str.substring(1,str.length()); //index 1~5까지 가져옴. 5는 생략
		System.out.println(str4); //BCDE
	} //end of main
} //end of class