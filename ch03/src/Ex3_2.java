
public class Ex3_2 {

	public static void main(String[] args) {
//		증가 연산자(++) 피연산자의 값을 1증가
//		감소 연산자(--) 피연산자의 값을 1감소
		int i=5, j=0;
		
		j= i++; // 후위형, 값이 참조된 후에 증가
		System.out.println("j=i++; 실행 후, i=" + i +", j=" + j);
//		j=i++; 실행 후, i=6, j=5
		
		i=5; // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j=0;
		
		j = ++i; // 전위형, 값이 참조되기 전에 증가
		System.out.println("j=++i; 실행 후, i=" + i +", j=" + j);
//		j=++i; 실행 후, i=6, j=6
		
		i = -10;
		i = -i;
		System.out.println(i); // i = -(-10);, i = 10
//		10
	}

}
