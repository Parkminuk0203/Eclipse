import java.util.*;
public class D220923_9 {

	public static void main(String[] args) {
		int score = 0;             
		char grade = ' ';          
		
		System.out.println("������  �Է��Ͻÿ�: ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt(); 	   // ȭ���� ���� �Է¹��� ���ڸ� score�� ����
		
		if (score > 100 || score < 0 ) {
		System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		} else if (score >=90) {          // score�� 90���� ũ�ų� ������ A����
			grade = 'A';
		} else if (score >=80) {   // score�� 80���� ũ�ų� ������ B����
			grade = 'B';
		} else if (score >=70) {   // score�� 70���� ũ�ų� ������ C����
			grade = 'C';	
		} else {				   
			grade = 'D';           // �� �� �������� D����
		}
		System.out.println("���� " + grade);
	}

}
