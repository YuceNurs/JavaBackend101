import java.util.Scanner;
public class Kullan�c�Girisi {

	public static void main(String[] args) {
		
		String userName, password, newpass;
		int select;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullan�c� ad�n�z:");
		userName = input.nextLine();
		
		System.out.print("�ifrenizi giriniz:");
		password = input.nextLine();
		
		
		if(userName.equals("patika")&& password.equals("123java")) {
			System.out.println("Ba�ar�yla giri� yapt�n�z.");
		}else {
			System.out.println("Hata. �ifrenizi s�f�rlay�n? ");
			System.out.println("1-Evet\n2-Hay�r");
		    System.out.print("Se�iminiz:");
	        select=input.nextInt();
			
			while(select==1) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Yeni �ifreniz:");
				newpass=sc.nextLine();
			
					if(newpass.equals("123java")) {
						System.out.print("Yeni �ifre eski �ifre ile ayn� olamaz.");
						
					}else {
						System.out.print("�ifreniz de�i�ti");
					}		
			}
			
		}
				
			

	}
}

