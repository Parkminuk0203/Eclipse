import java.util.*;
public class D221014_3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i,j,k = 0;
	int n = sc.nextInt();
	
	for(i=1;i<=n;i++) {
		for(j=1;j<i;j++) {
			System.out.print(" ");
		}
		for(k=n;k>=i;k--) {
			System.out.print("*");
		}
		System.out.println();
	}
	
		
	} // end of main

} // end of class
