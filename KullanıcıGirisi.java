import java.util.Scanner;
public class KullaniciGirisi {

	public static void main(String[] args) {
		
		String userName, password, newpass;
		int select;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanıcı adınız:");
		userName = input.nextLine();
		
		System.out.print("şifrenizi giriniz:");
		password = input.nextLine();
		
		
		if(userName.equals("patika")&& password.equals("123java")) {
			System.out.println("Başarıyla giriş yaptınız.");
		}else {
			System.out.println("Hata. şifrenizi sıfırlayın? ");
			System.out.println("1-Evet\n2-Hayır");
		        System.out.print("Seçiminiz:");
	                select=input.nextInt();
			
			while(select==1) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Yeni şifreniz:");
				newpass=sc.nextLine();
			
					if(newpass.equals("123java")) {
						System.out.print("Yeni şifre eski şifre ile aynı olamaz.");
						
					}else {
						System.out.print("şifreniz değişti");
					}		
			}
			
		}
				
			

	}
}

