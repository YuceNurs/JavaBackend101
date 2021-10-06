import java.util.Scanner;
public class GectiKaldi {

	public static void main(String[] args) {
		int mat, fizik, kimya, bio, geo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("mat notunuz:");
		mat = sc.nextInt();
		System.out.println("fizik notunuz:");
		fizik = sc.nextInt();
		System.out.println("kimya notunuz:");
		kimya = sc.nextInt();
		System.out.println("bio notunuz:");
		bio = sc.nextInt();
		System.out.println("geo notunuz:");
		geo = sc.nextInt();
		
		double average = (mat + fizik + kimya + bio + geo)/5;
		if(average<=55) {
			System.out.println("Dersten kaldýnýz"+" "+ "ortalamanýz:"+" "+ average);
		}else {
			System.out.print("Dersi geçtiniz"+" "+"ortalamanýz:"+ " "+ average);
		}
	

	}

}
