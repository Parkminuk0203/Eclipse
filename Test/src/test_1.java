import java.util.*;
 
public class test_1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i,j = 0;
	
	for (i=1;i<=n;i++) {
		for (j=n;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
    
	}
}