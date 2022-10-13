package Report;
import java.util.*;
public class report_30 {

	public static void main(String[] args) {
//		18. 사용자로부터 3개의 정수를 읽어 들인 후에 if-else 문을 사용하여 
//		가장 작은 값을 결정하는 프로그램을 작성하라. 
	    Scanner sc = new Scanner(System.in);
	    
	    int min = 0;

	    System.out.print("정수입력: ");
	    int num1 = sc.nextInt();
	    System.out.print("정수입력: ");
	    int num2 = sc.nextInt();
	    System.out.print("정수입력: ");
	    int num3 = sc.nextInt();

	    if (num1 > num2) {
	    	if (num2 > num3) {
	    		min = num3;
	    	} else {
	    		min = num2;
	    	}	
	    } else if (num1 > num3) {
	    	min = num3;
	    } else {
	    	min = num1;
	    }
	    System.out.println("최소 값 : "+min);
		
	          
	} // end of main
	    
} // end of class
