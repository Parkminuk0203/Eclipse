
public class VarEx3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean power = true;
		
		byte b = 127; //byte ���� -128~127
		
		int oct = 010; // 8����, 10������ 8
		int hex = 0x10; // 16����, 10������ 16
		
		int i = 2_000_000_000; // int ������ +-20���� �ִ�
		long l = 10_000_000_000L; // 20���� �Ѵ� ���� L ���λ� ���
		
		float f = 3.14f; // �Ǽ��� ���̻� f ���� �Ұ���
		double d = 3.14; // �Ǽ��� ���̻� d ���� ����
		// ������ ���ͷ� Ÿ���� ��ġ���� ������ ���� doble�� ���ͷ� float���� ���� Ŀ�� ����
		
		System.out.println(power);
		System.out.println(oct);
		System.out.println(hex);
		
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
	}

}
