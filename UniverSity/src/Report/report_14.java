package Report;
import java.util.*;
public class report_14 {

	public static void main(String[] args) {
//		6-3. ������ ���α׷����� �����Ǵ� ��� ����� �����ΰ�?
		
		int i = 0, sum = 0;
		
		while(i < 10 ) 
		{
		sum += i++;
		if( i % 3 == 0 ) continue; // 3�� ����� Ż���ϰ� ���� �ݺ��� ����
		System.out.println("i="+i);
		if( sum > 10 ) break;
		}
		
		
	} // end of main

} // end of class
