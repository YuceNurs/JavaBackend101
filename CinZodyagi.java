import java.util.Scanner;
public class CinZodyagi {

	public static void main(String[] args) {
		
		int birthDate, result;
		String[] horoscopes = {"Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan",
		"Tavþan","Ejderha","Yýlan","At","Koyun"};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Doðum Yýlýnýz :");
		birthDate = input.nextInt();
		result = birthDate%12;
		
		System.out.println("Çin Zodyak Burcunuz : "+horoscopes[result]);
	}

}
