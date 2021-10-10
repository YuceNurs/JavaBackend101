import java.util.Scanner;
public class Odev1 {

	public static void main(String[] args) {
		int mat,fizik,kimya,tarih,muzik;
		
		Scanner inp= new Scanner(System.in);
		
		System.out.println("Matematik notunuz:");
		mat=inp.nextInt();
		
		System.out.println("Fizik notunuz:");
		fizik=inp.nextInt();
		
		System.out.println("Kimya notunuz:");
		kimya=inp.nextInt();
		
		System.out.println("Tarih notunuz:");
		tarih=inp.nextInt();
		
		System.out.println("Müzik notunuz:");
		muzik=inp.nextInt();
		
		double toplam=(mat + fizik + kimya+ tarih + muzik);
		double ortalama= (toplam)/6;
		System.out.println("Ortalamanýz:" +" "+ ortalama);
		
		boolean sart = ortalama >= 50;
		System.out.println("Durum = " + (sart==true ? "Geçti" : "Kaldý"));

	}

}
