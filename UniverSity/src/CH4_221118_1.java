import java.util.*;

public class CH4_221118_1 {

	public static void main(String[] args) {
//		1000������ ������ ���
		for(int i=1;i<=1000;i++) { //������ ���ڱ��� ��� ���ڸ� �ݺ� �˻�
			int sum=0;
			for(int j=1;j<i;j++) { 
				if(i%j==0) { // ����� ���͸��ϴ� ����
					sum+=j; // ������� ���ϴ� ����
				}
			}
			if(i==sum) { // �ݺ��� ���� �� ����鸸 ���
				System.out.println(i);
			}
		}
	} // end of main

} // end of class