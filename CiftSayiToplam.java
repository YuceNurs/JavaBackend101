import java.util.Scanner;
public class CiftSayiToplam {

	public static void main(String[] args) {
		
		int n, toplam=0;
		Scanner sc = new Scanner(System.in);
		 do {
			 System.out.print("Sayi giriniz:");
			 n=sc.nextInt();
			 if(n % 2==0) {
				 toplam += n;
			 }
		 }while(n%2!=1 & n<0);
		 
		 System.out.println("Sonuç"+" "+toplam);

	}

}
