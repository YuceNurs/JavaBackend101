import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		double tutar, kdvOrani = 1.8 , kdvTutar, kdvliTutar;
		Scanner input=new Scanner(System.in);
		System.out.println("Ücret tutarýný giriniz:");
		tutar=input.nextDouble();
		kdvTutar= tutar* kdvOrani;
		kdvliTutar= tutar + kdvTutar;
		
		System.out.println("Kdvli ücret tutarýnýz:"+" "+ kdvliTutar);
	}

}
