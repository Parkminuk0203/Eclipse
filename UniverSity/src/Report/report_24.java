package Report;
import java.util.*;
public class report_24 {

	public static void main(String[] args) {
//		12. 3���� ���ڸ� �޾Ƽ� ũ�� ������ �����ϴ� ���α׷��� �ۼ��Ͽ� ����. if-else�� ����Ѵ�.
		
        Scanner sc = new Scanner(System.in);

        System.out.print("�����Է�:");
        int num1 = sc.nextInt();
        System.out.print("�����Է�:");
        int num2 = sc.nextInt();
        System.out.print("�����Է�:");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3) {
            if(num2<num3) {
                System.out.printf("���ĵȼ���: %d %d %d",num1,num3,num2);
            }
            else {
                System.out.printf("���ĵȼ���: %d %d %d",num1,num2,num3);
            }
        }
        else if(num2 > num1 && num2 > num3){
            if(num1<num3) {
                System.out.printf("���ĵȼ���: %d %d %d",num2,num3,num1);
            }
            else {
                System.out.printf("���ĵȼ���: %d %d %d",num2,num1,num3);
            }

        }
        else {
            if(num1>num2) {
                System.out.printf("���ĵȼ���: %d %d %d",num3,num1,num2);
            }
            else {
                System.out.printf("���ĵȼ���: %d %d %d",num3,num2,num1);
            }
        }
    }

}
