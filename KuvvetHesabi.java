import java.util.Scanner;
public class KuvvetHesabi {

	public static void main(String[] args) {
		
		int k;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Sýnýr sayýsýný giriniz:");
		k = sc.nextInt();
		
		for(int i=1; i<=k; i*=4) {
			System.out.println(i);
		}
				
		for(int i=1; i<=k; i*=5 ) {
			System.out.println(i);
		} 
		
		

	}

}
