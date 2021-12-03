package patika.dev;
import java.util.*;
import java.util.Scanner;
public class Main {
	
	       static boolean isFind(int[] arr, int value) {
		    	for(int i : arr) {
		    		if(i==value) {
		    			return true;
		    		}
		    	}
		    return false;
		    }
		    public static void main(String[] args) {
		    
		    int[] list = {1,3,3,2,1,4,5,6,8,9};
		    int[] duplicate = new int[list.length];
		    int startIndex=0;
		    
		    for(int i=0; i<list.length;i++) {
		    	for (int j=0; j<list.length; j++) {
		    	if((i!=j)&&(list[i]==list[j])) {
		    		if(!isFind(duplicate,list[i])) {
		    			duplicate[startIndex++]=list[i];
		    		}
		    		break;
		    	}
		    	}
		    }
		    System.out.println(Arrays.toString(duplicate));
		    
		     }
		    
}
