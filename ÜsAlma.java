import java.util.Scanner;
public class �sAlma {

	public static void main(String[] args) {
		
		int n,k, total=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("�ss� alinacak sayiyi giriniz:");
		n = sc.nextInt();
		System.out.print("Us olacak sayi:");
		k = sc.nextInt();
		
		for(int i=1; i<=k ; i++ ) {
			total *=n;
		}System.out.print("Sonu�:"+ " " + total);

	}

}
