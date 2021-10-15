import java.util.Scanner;
public class MükoSayi {

	public static void main(String[] args) {
		int sayi, result=0;
		Scanner sc = new Scanner (System.in);
		System.out.print("Bir sayý giriniz:");
		sayi=sc.nextInt();
		
		 for(int i = 1; i < sayi; i++)
	        {
	            if(sayi % i == 0) {
	                sayi += i;
	            }
	        }

	        if(result == sayi){
	            System.out.print(sayi+" sayýsý mükemmel sayýdýr.");
	        }
	        else
	            System.out.print(sayi+" sayýsý mükemmel sayý deðildir.");
	}
}
	
	




