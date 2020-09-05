import java.util.Arrays;
import java.util.Scanner;

public class vbn {
	public static void main(String[] args) {
		int finalBase = 12;
		int number = 14527;
		
		int quo;
	    int rem;
	    char[] res = new char[1];

	    do {
	        rem = number % finalBase;
	        quo = number / finalBase;
	        res = Arrays.copyOf(res, res.length + 1);
	        if (rem < 10) {
	            //Converting ints using ASCII values
	            rem += 48;
	            res[res.length - 1] = (char) rem;
	        } else {
	            //Convert int > 9 to A, B, C..
	            rem += 55;
	            res[res.length - 1] = (char) rem;
	        }
	        number /= finalBase;
	    } while (quo != 0);


	    //Reverse array
	    char[] temp = new char[res.length];
	    for (int i = res.length - 1, j = 0; i > 0; i--) {
	        temp[j++] = res[i];
	    }
	    System.out.println(temp);

	}
}
