package Report;
import java.util.*;
public class report_27 {

	public static void main(String[] args) {
//		15. »ç¿ëÀÚ·ÎºÎÅÍ Å°¸¦ ÀÔ·Â¹Ş¾Æ¼­  Ç¥ÁØ Ã¼ÁßÀ» °è»êÇÑ ÈÄ¿¡ »ç¿ëÀÚÀÇ Ã¼Áß°ú ºñ±³ÇÏ¿© 
//		ÀúÃ¼ÁßÀÎÁö, Ç¥ÁØÀÎÁö, °úÃ¼ÁßÀÎÁö¸¦ ÆÇ´ÜÇÏ´Â ÇÁ·Î±×·¥À» ÀÛ¼ºÇÏ¶ó. 
//		Ç¥ÁØ Ã¼Áß °è»ê½ÄÀº ´ÙÀ½À» »ç¿ëÇÏ¶ó. 
//		Ç¥ÁØ Ã¼Áß = (Å° - 100) * 0.9ÉŞÉôÉİ
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Å°¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
		double h = sc.nextDouble();
		System.out.print("¸ö¹«°Ô¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
		double w = sc.nextDouble();

		double avg = (h-100)*0.9;
		System.out.printf("Ç¥ÁØÃ¼ÁßÀº %.1f\n",avg);
		
		if (w > avg) {
			System.out.println("°úÃ¼Áß ÀÔ´Ï´Ù.");
		} 
		else if (w < avg) {
			System.out.println("ÀúÃ¼Áß ÀÔ´Ï´Ù.");
		}
		else {
			System.out.println("Á¤»ó ÀÔ´Ï´Ù.");
		}
		
		
	} // end of main

} // end of class
