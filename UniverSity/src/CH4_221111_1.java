import java.util.*;

public class CH4_221111_1 {

	public static void main(String[] args) {
		// �ζ�
		System.out.println("===== �ζ� ���ǹ�ȣ ���� =====");
		int lotto[] = new int [6];
		
		// ��ȣ ����
		int i=0, j=0;
		for(i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(j=0;j<i;j++) { // �ߺ� ����
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}
		System.out.print("�ζ� ��ȣ : ");
		// ��ȣ ���
		for(i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		
	} // end of main

} // end of class