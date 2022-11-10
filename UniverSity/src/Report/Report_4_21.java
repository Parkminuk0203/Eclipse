package Report;
import java.util.*;

public class Report_4_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] hexa2bin = 
		{ "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		String num;
		
		System.out.println("16진수 문자열을 입력하시오 : ");
		num = sc.next();
		System.out.print(num + " 이진수 : ");
		int i;
		for (i=0; i<num.length(); i++) {
			switch (num.charAt(i)) {
			case '0':
				System.out.println(hexa2bin[0]);
				break;
			case '1':
				System.out.println(hexa2bin[1]);
				break;
			case '2':
				System.out.println(hexa2bin[2]);
				break;
			case '3':
				System.out.println(hexa2bin[3]);
				break;
			case '4':
				System.out.println(hexa2bin[4]);
				break;
			case '5':
				System.out.println(hexa2bin[5]);
				break;
			case '6':
				System.out.println(hexa2bin[6]);
				break;
			case '7':
				System.out.println(hexa2bin[7]);
				break;
			case '8':
				System.out.println(hexa2bin[8]);
				break;
			case '9':
				System.out.println(hexa2bin[9]);
				break;
			case 'a':
				System.out.println(hexa2bin[10]);
				break;
			case 'b':
				System.out.println(hexa2bin[11]);
				break;
			case 'c':
				System.out.println(hexa2bin[12]);
				break;
			case 'd':
				System.out.println(hexa2bin[13]);
				break;
			case 'e':
				System.out.println(hexa2bin[14]);
				break;
			case 'f':
				System.out.println(hexa2bin[15]);
				break;
			default:
				System.out.println("잘못된 값입니다. 다시 입력하시오.");
			}
		}

	} // end of main
} // end of class