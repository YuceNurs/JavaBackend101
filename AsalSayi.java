
public class AsalSayi {

	public static void main(String[] args) {
		
        int counter = 0;
        for(int sayi=2;sayi<=100;sayi++)
        {
            int check = 0;
            for (int i = 2; i < sayi; i++)
            {
               if (sayi % i == 0)
                {
                    check = 1;
                    break;
                } 
            }
                
            if(check==0)
            {
                System.out.print(sayi+"\n");
                counter++; 
            }
        }
    }    
}