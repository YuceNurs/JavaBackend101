package patika.dev;
import java.util.*;

public class Main {

		    public static void main(String[] args) {
		        int[] num = {1, 2, 3, 4, 5};
		        double harmonik = 0;
		        for (int i = 0; i < num.length; i++) {
		        	harmonik = harmonik + 1.0 / num[i];	
		        }
		        System.out.println(num.length /harmonik );
		   }
}