package ex2;

public class Program2 {

	public static void main(String[] args) {
		String str = "Some phare with white space pattern";
		
		String [] strSplit = str.split(" ");
		
		for (int i = 0; i < strSplit.length; i++) {
			System.out.printf("Str[%d] = %s%n", i, strSplit[i]);
		}

	}

}
