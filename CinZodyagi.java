import java.util.Scanner;
public class CinZodyagi {

	public static void main(String[] args) {
		
		int birthDate, result;
		String[] horoscopes = {"Maymun","Horoz","K�pek","Domuz","Fare","�k�z","Kaplan",
		"Tav�an","Ejderha","Y�lan","At","Koyun"};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Do�um Y�l�n�z :");
		birthDate = input.nextInt();
		result = birthDate%12;
		
		System.out.println("�in Zodyak Burcunuz : "+horoscopes[result]);
	}

}
