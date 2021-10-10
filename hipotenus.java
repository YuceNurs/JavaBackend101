import java.util.Scanner;
public class Odev3 {

	public static void main(String[] args) {
		//Hipotenüs hesabý 
		double a,b,c;
		
		Scanner input = new Scanner(System.in);
		System.out.println("1.Kenarý giriniz:");
		a=input.nextDouble();
		System.out.println("2.Kenarý giriniz:");
		b=input.nextDouble();
		
		c= Math.sqrt((a*a)+(b*b));
		System.out.println("Hipotenüs :" + " "+ c);

	}

}
