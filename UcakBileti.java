import java.util.Scanner;
public class UcakBileti {

	public static void main(String[] args) {
		
		int distance, age ,type;
		double perKm=0.10;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Gideceđiniz mesafeyi km cinsinden yazýnýz:");
		distance = sc.nextInt();
		
		double ticketPrice = distance * perKm;
		System.out.println(ticketPrice);
		
		
		System.out.println("Yolculuk tipi:\n 1-Tek Yön \n2-Gidiţ_Dönüţ");
		type = sc.nextInt();
		
		System.out.println("Yasiniz:");
		age = sc.nextInt();
		if(type==1) {
			
			if(age<12) {
				double newPrice = ticketPrice - ((ticketPrice*50)/100);
				System.out.print("Bilet tutarý:"+" "+ newPrice);
			}else if(age>12 && age<24) {
				double new2Price = (ticketPrice) - ((ticketPrice*10)/100);
				System.out.print("Bilet tutarý:"+" "+new2Price);
			}else if(age>65) {
				double new3Price =(ticketPrice)- ((ticketPrice*30)/100);
				System.out.print("Bilet tutarý:"+" "+new3Price);
			}else {
				System.out.println("Girdiđiniz bilgilerde hata var.");
			}
					
		}else if(type==2) {
			
			double newPrice =(ticketPrice)- ((ticketPrice*20)/100);
			System.out.print("Bilet tutarý:"+" "+newPrice);
			
		    	if(age<12) {
		    		double new0Price = newPrice - ((newPrice*50)/100);
		    		System.out.print("Bilet tutarý:"+" "+ new0Price);
		    	}else if(age>12 && age<24) {
		    		double new2Price = (newPrice) - ((newPrice*10)/100);
		    		System.out.print("Bilet tutarý:"+" "+new2Price);
		    	}else if(age>65) {
		    		double new3Price =(newPrice)- ((newPrice*30)/100);
		    		System.out.print("Bilet tutarý:"+" "+new3Price);
		    	}else {
		    		System.out.println("Bilgilerde hata olabilir.Tekrar kontrol ediniz.");
		    	}
		}else {
			System.out.println("Hata.BÝlgilerinizi tekrar kontrol ediniz.");
		}
			
}
}
