import java.util.Scanner;
public class Odev5 {

	public static void main(String[] args) {
		
		double  lenght ,height,index;
		Scanner input= new Scanner(System.in);
		
		System.out.println("Boyunuzu m cinsinden giriniz:");
		lenght =input.nextDouble();
		
		System.out.println("Kilonuzu kg cinsinden giriniz:");
		height =input.nextDouble();
		
		index = height/(lenght*lenght);
		System.out.println("Vücut indeksiniz:"+" "+ index);
		

	}

}
