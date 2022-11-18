import java.util.*;

public class CH4_221118_2 {

	public static void main(String[] args) {
//		약수 구하기
		Scanner sc = new Scanner(System.in);
		int num=0, sum=0;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		int i=0;
		for(i=1; i<num; i++) {
			if(num%i==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("약수의 합:"+sum);
	} // end of main

} // end of class