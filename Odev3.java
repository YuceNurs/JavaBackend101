import java.util.Scanner;
public class Odev3 {

	public static void main(String[] args) {
		//Hipoten�s hesab� 
		double a,b,c;
		
		Scanner input = new Scanner(System.in);
		System.out.println("1.Kenar� giriniz:");
		a=input.nextDouble();
		System.out.println("2.Kenar� giriniz:");
		b=input.nextDouble();
		
		c= Math.sqrt((a*a)+(b*b));
		System.out.println("Hipoten�s :" + " "+ c);

	}

}
