import java.util.Scanner;
public class Odev4 {

	public static void main(String[] args) {
		double km, perKm =2.20,startPrice=10, total;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Mesafeyi km cinsinden giriniz:");
		km=input.nextDouble();
		
		total= km*perKm;
		total += startPrice;
		
		total =(total<20) ? 20: total;
		System.out.println("Toplam tutar:" +" "+ total);
	}

}
