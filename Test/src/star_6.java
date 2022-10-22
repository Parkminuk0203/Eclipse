import java.util.*;
public class star_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j,k = 0;
		for(i=n;i>0;i--) {
			for(j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(k=i*2-1;k>0;k--) {
				System.out.print("*");
			}
		System.out.println();
		}
		
	}

}
