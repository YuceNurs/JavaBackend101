import java.util.Scanner;
public class KullanýcýGirisi {

	public static void main(String[] args) {
		
		String userName, password, newpass;
		int select;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanýcý adýnýz:");
		userName = input.nextLine();
		
		System.out.print("Þifrenizi giriniz:");
		password = input.nextLine();
		
		
		if(userName.equals("patika")&& password.equals("123java")) {
			System.out.println("Baþarýyla giriþ yaptýnýz.");
		}else {
			System.out.println("Hata. Þifrenizi sýfýrlayýn? ");
			System.out.println("1-Evet\n2-Hayýr");
		    System.out.print("Seçiminiz:");
	        select=input.nextInt();
			
			while(select==1) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Yeni þifreniz:");
				newpass=sc.nextLine();
			
					if(newpass.equals("123java")) {
						System.out.print("Yeni þifre eski þifre ile ayný olamaz.");
						
					}else {
						System.out.print("Þifreniz deðiþti");
					}		
			}
			
		}
				
			

	}
}

