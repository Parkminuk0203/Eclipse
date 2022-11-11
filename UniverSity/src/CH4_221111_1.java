import java.util.*;

public class CH4_221111_1 {

	public static void main(String[] args) {
		// 로또
		System.out.println("===== 로또 복권번호 생성 =====");
		int lotto[] = new int [6];
		
		// 번호 생성
		int i=0, j=0;
		for(i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(j=0;j<i;j++) { // 중복 제거
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}
		System.out.print("로또 번호 : ");
		// 번호 출력
		for(i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		
	} // end of main

} // end of class