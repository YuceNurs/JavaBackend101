import java.util.Scanner;
public class Sorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, max=0,min=0;
		for (int i=1; i<=4;i++){
			 System.out.print(i+". Sayýyý giriniz: ");
             num=sc.nextInt();
             if (i==1){
                    max=num;
                    min=num;
            }
            if (num>max){
                    max=num;
            }
            if(num<min){
            min=num;
            }
           
             }
		   System.out.println("max : "+max);
           System.out.println("min : "+min);
            
    }
 

}
