import java.util.Scanner;
public class FaktoriyelHesabi {

	public static void main(String[] args) {
		int k, total=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Faktöriyel hesabi için sayi giriniz:");
		k = sc.nextInt();
		
		for(int i=1 ; i<=k; i++) {
			System.out.println(i);
			total = total*i;
		}
		System.out.println("Sonuc:"+" "+total);

	}

}
