package Report;
import java.util.*;
public class report_24 {

	public static void main(String[] args) {
//		12. 3개의 숫자를 받아서 크기 순으로 정렬하는 프로그램을 작성하여 보자. if-else를 사용한다.
		
        Scanner sc = new Scanner(System.in);

        System.out.print("정수입력:");
        int num1 = sc.nextInt();
        System.out.print("정수입력:");
        int num2 = sc.nextInt();
        System.out.print("정수입력:");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3) {
            if(num2<num3) {
                System.out.printf("정렬된숫자: %d %d %d",num1,num3,num2);
            }
            else {
                System.out.printf("정렬된숫자: %d %d %d",num1,num2,num3);
            }
        }
        else if(num2 > num1 && num2 > num3){
            if(num1<num3) {
                System.out.printf("정렬된숫자: %d %d %d",num2,num3,num1);
            }
            else {
                System.out.printf("정렬된숫자: %d %d %d",num2,num1,num3);
            }

        }
        else {
            if(num1>num2) {
                System.out.printf("정렬된숫자: %d %d %d",num3,num1,num2);
            }
            else {
                System.out.printf("정렬된숫자: %d %d %d",num3,num2,num1);
            }
        }
    }

}
