package Report;
import java.util.*;
public class report_30 {

	public static void main(String[] args) {
//		18. ����ڷκ��� 3���� ������ �о� ���� �Ŀ� if-else ���� ����Ͽ� 
//		���� ���� ���� �����ϴ� ���α׷��� �ۼ��϶�. 
	    Scanner sc = new Scanner(System.in);
	    
	    int min = 0;

	    System.out.print("�����Է�: ");
	    int num1 = sc.nextInt();
	    System.out.print("�����Է�: ");
	    int num2 = sc.nextInt();
	    System.out.print("�����Է�: ");
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
	    System.out.println("�ּ� �� : "+min);
		
	          
	} // end of main
	    
} // end of class
