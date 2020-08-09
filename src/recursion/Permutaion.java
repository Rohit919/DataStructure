package recursion;

import java.util.ArrayList;

public class Permutaion {

	public static void main(String[] args) {
		for (String ss : getPermutation("abc"))
			System.out.println(ss);

	}

	public static ArrayList<String> getPermutation(String str) {
		if (str.length() == 1) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add(str);
			return baseResult;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getPermutation(ros);
		for (String ss : recResult) {
			for (int i = 0; i <= ss.length(); i++) {
			String str1 = ss.substring(0, i) + cc + ss.substring(i);	
			myResult.add(str1);
			}
		}
		return myResult;
	}

}
