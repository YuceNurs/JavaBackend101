import java.util.Scanner;
public class Atm {

	public static void main(String[] args) {
		
		String userName, password;
		Scanner sc = new Scanner(System.in);
		//3 hak tanýyalým while döngüsü ...
		int right=3;
		int balance =2000, select;
		while (right>0) {
			
			System.out.print("Kullanici adiniz:");
		    userName= sc.nextLine();
		    System.out.print("Þifreniz:");
		    password = sc.nextLine();
		    
		    if(userName.equals("patika")&& password.equals("123456")){
		    	System.out.println("Hoþgeldiniz.");
		    	do {
		    		System.out.println("1)Para yatýrma\n"
		    				+ "2)Para çekme\n"
		    				+ "3)Bakiye sorgulama\n"
		    				+ "4)Çýkýþ");
		    		System.out.print("Yapmak istediðiniz iþlemi seçiniz:");
		    		select =sc.nextInt();
		    		if(select==1) {
		    			System.out.print("Yatýrýlacak para miktarý:");
		    			int price = sc.nextInt();
		    			balance += price;
		    		}else if (select==2) {
		    			System.out.print("Çekilecek tutarý giriniz:");
		    			int price=sc.nextInt();
		    			if(balance<price) {
		    				System.out.println("Bakiye yetersiz.");
		    			}else {
		    				balance -=price;
		    			}
		    		}else if(select==3) {
		    			System.out.println("Bakiyeniz"+" " +balance);
		    		}
		    	}while(select !=4);
		    	System.out.println("Tekrar görüþmek üzere.");
		    	break;
		    }else {
		    	right--;
		    	System.out.println("Hatalý kullanýcý giriþi");
		    	if(right==0) {
		    		System.out.print("Hesabiniz bloke olustur.");
		    	}else {
		    		System.out.println("Kalan hakkýnýz:"+ right);
		    	}
		    }
		}
		

	}

}
