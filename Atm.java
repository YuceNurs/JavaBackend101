import java.util.Scanner;
public class Atm {

	public static void main(String[] args) {
		
		String userName, password;
		Scanner sc = new Scanner(System.in);
		//3 hak tan�yal�m while d�ng�s� ...
		int right=3;
		int balance =2000, select;
		while (right>0) {
			
			System.out.print("Kullanici adiniz:");
		    userName= sc.nextLine();
		    System.out.print("�ifreniz:");
		    password = sc.nextLine();
		    
		    if(userName.equals("patika")&& password.equals("123456")){
		    	System.out.println("Ho�geldiniz.");
		    	do {
		    		System.out.println("1)Para yat�rma\n"
		    				+ "2)Para �ekme\n"
		    				+ "3)Bakiye sorgulama\n"
		    				+ "4)��k��");
		    		System.out.print("Yapmak istedi�iniz i�lemi se�iniz:");
		    		select =sc.nextInt();
		    		if(select==1) {
		    			System.out.print("Yat�r�lacak para miktar�:");
		    			int price = sc.nextInt();
		    			balance += price;
		    		}else if (select==2) {
		    			System.out.print("�ekilecek tutar� giriniz:");
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
		    	System.out.println("Tekrar g�r��mek �zere.");
		    	break;
		    }else {
		    	right--;
		    	System.out.println("Hatal� kullan�c� giri�i");
		    	if(right==0) {
		    		System.out.print("Hesabiniz bloke olustur.");
		    	}else {
		    		System.out.println("Kalan hakk�n�z:"+ right);
		    	}
		    }
		}
		

	}

}
