import java.util.Scanner;
public class KombinasyonHesabi {

	public static void main(String[] args) {
		
		int num1,num2, total1=1,total2=1,total3=1;;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Birinci Sayiyi Giriniz: ");
		num1 = input.nextInt();
		
		for (int i= 1 ; i <= num1; i++) {
			
			total1 = total1 * i;
		}
		
		System.out.println("İkinci sayiyi Giriniz: ");
		num2 = input.nextInt();
		
		for (int i= 1 ; i <= num2; i++) {
			
			total2 = total2 * i;
		}
		
		for(int i = 1 ; i <= num1-num2; i++) {
			total3 = total3 * i;
		}
		
		int result = (total1) / (total2 *total3);
		
		System.out.println("Kombinasyon Hesaplandi: "+result);
		

	}

}
