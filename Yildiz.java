import java.util.Scanner;
public class Yildiz {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Basamak deðerini giriniz:");
		int n= sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for (int k =1; k<=(n-i); k++) {
				System.out.print(" ");
			}
			for(int s=1; s<=((2*i)-1); s++) {
				System.out.print("*");
			}System.out.println();
		}
		int f=1;
		
        for(int i=n-2;i>=0;i--){

            for(int k=0;k<=f;k++){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
            f++;

        }
		}

	}

