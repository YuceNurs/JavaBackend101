import java.util.Scanner;
public class Burc {

	public static void main(String[] args) {
		
			int ay, gun;
			Scanner scanner = new Scanner(System.in);
		
		
		    System.out.println("Hangi G�n Do�dunuz ? ");
		    gun = scanner.nextInt();

		    System.out.println("Hangi Ayda Do�dunuz ? (�rnek:1,2) ");
		    ay = scanner.nextInt();

		    if ((gun >= 22 && gun <= 31 && ay== 1) || (gun >= 1 && gun <= 19 && ay == 2)) {
		        System.out.println("Burcunuz: Kova ");
		    }
		    else if((gun >= 20 && gun <= 28 && ay == 1) || (gun >= 1 && gun <= 20 && ay == 3)){
		        System.out.println("Burcunuz: Bal�k ");
		    }
		    else if ((gun >= 22 && gun <= 31 && ay == 12) || (gun >= 1 && gun <= 21 && ay == 1)) {
		        System.out.println("Burcunuz: O�lak");
		    }
		    else if ((gun >= 22 && gun <= 30 && ay == 9) || (gun >= 1 && gun <= 22 && ay == 10)) {
		        System.out.println("Burcunuz: Terazi");
		    }
		    else if ((gun >= 23 && gun <= 31 && ay == 10) || (gun >= 1 && gun <=21 && ay ==11)) {
		        System.out.println("Burcunuz: Akrep");
		    }
		    else if ((gun >= 22 && gun <= 30 && ay == 11) || (gun >= 1 && gun <= 21 && ay == 12)) {
		        System.out.println("Burcunuz: Yay");
		    }
		    else if ((gun >= 21 && gun <= 30 && ay == 6) || (gun >= 1 && gun <= 22 && ay == 7)) {
		        System.out.println("Burcunuz: Yenge�");
		    }
		    else if ((gun >= 23 && gun <= 31 && ay == 7) || (gun >= 1 && gun <= 22 && ay == 8)) {
		        System.out.println("Burcunuz: Aslan");
		    }
		    else if ((gun >= 23 && gun <= 31 && ay == 8) || (gun >= 1 && gun <= 22 && ay == 9)) {
		        System.out.println("Burcunuz: Ba�ak");
		    }
		    else if ((gun >= 21 && gun <= 31 && ay == 3) || (gun >= 1 && gun <= 20 && ay == 4)) {
		        System.out.println("Burcunuz: Ko�");
		    }
		    else if ((gun >= 21 && gun <= 30 && ay == 4) || (gun >= 1 && gun <= 20 && ay == 5)) {
		        System.out.println("Burcunuz: Bo�a");
		    }
		    else if ((gun >= 21 && gun <= 31 && ay == 5) || (gun >= 1 && gun <= 20 && ay == 6)) {

		    }else {
		    	System.out.println("Hatal� giri�.");
		    }
		
	}
 }

