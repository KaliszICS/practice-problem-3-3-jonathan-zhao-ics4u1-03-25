import java.util.ArrayList;
public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static ArrayList<String> perms(String word1) {
		ArrayList<String> perms1 = new ArrayList<String>();
		permsHelper("", word1, perms1);
		return perms1;
	}

	public static void permsHelper(String usedLetters, String unusedLetters, ArrayList<String> perms1) {
		if (unusedLetters.equals("")) {
			perms1.add(usedLetters);
			return;
		}

		for (int i = 0; i < unusedLetters.length(); i++) {
			String tempUsed = usedLetters + unusedLetters.charAt(i);
			String tempUnused = unusedLetters.substring(0, i) + unusedLetters.substring(i + 1);
            permsHelper(tempUsed, tempUnused, perms1);
		}
		

	}


	public static ArrayList<String> permsUnique(String word2) {
		ArrayList<String> perms2 = new ArrayList<String>();
		permsHelperUnique("", word2, perms2);
		return perms2;
	}

	public static void permsHelperUnique(String usedLetters, String unusedLetters, ArrayList<String> perms2) {
		if (unusedLetters.isEmpty()) {
			if (!perms2.contains(usedLetters)) {
				perms2.add(usedLetters);
			}
			return;
		}

		for (int i = 0; i < unusedLetters.length(); i++) {
			String tempUsed = usedLetters + unusedLetters.charAt(i);
			String tempUnused = unusedLetters.substring(0, i) + unusedLetters.substring(i + 1);
            permsHelperUnique(tempUsed, tempUnused, perms2);
		}
		
		
	}

	

}