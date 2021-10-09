import java.util.Scanner;
public class OnikiKatlar {

	public static void main(String[] args) {
		
		int k,num, toplam=0, ort = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bir sayý giriniz:");
		k = sc.nextInt();
		
		for (int i=0; i<=k; ++i) {
			if(i%12!=0) {
			continue;
			}
			System.out.println(i);
			num = k%12;
			toplam= (i+toplam);
			ort = toplam/num ;
			
		} 
		System.out.println("toplam:"+ toplam);
		System.out.println("ortalama:"+ ort);
	
		
		

	        

	}}
