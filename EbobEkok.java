import java.util.Scanner;
public class EbobEkok {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n1 say�s�n� giriniz:");
		int n1 = sc.nextInt();
		System.out.print("n2 say�s�n� giriniz:");
		int n2 = sc.nextInt();
		int ebob=1,ekok;
		
		
		
		for(int k =n1; k>=1; k--) {
			
			if(n1%k==0 && n2 %k==0 ) {
				ebob = k;
				System.out.println("ebob de�eri:" +" " +ebob);
			break;
				};
				
	
		}ekok = (n1*n2)/ebob;
		System.out.println("ekok de�eri:" +" " +ekok);
		
		
		
		
	
	}
   
}
