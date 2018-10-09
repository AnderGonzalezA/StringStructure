import java.util.Scanner;
public class SS1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a line:");
		String str = sc.nextLine();
		int a = str.length();
		System.out.println("Your line's length is: " + a + " characters");
		
		System.out.println("Please enter a token:");
		String str2 = sc.nextLine();
		String b = str2.substring(3);
		System.out.println("Without the first 3 characters: " + b);
		
		System.out.println("Please enter a line:");
		String str3 = sc.nextLine();
		String c = str3.trim();
		System.out.println("Your line with no leading and trailing whitespace is: " + c);
		
		System.out.println("Please enter a token:");
		String str4 = sc.nextLine();
		char d = str4.charAt(3);
		System.out.println("The fourth character of the string is: " + d);
		
		System.out.println("Please enter two lines:");
		String str5 = sc.nextLine();
		String str6 = sc.nextLine();
		int e = str5.compareTo(str6);
		System.out.println("Their lexicographic comparison: " + e);
		
		System.out.println("Please enter two lines:");
		String str7 = sc.nextLine();
		String str8 = sc.nextLine();
		int f = str7.compareToIgnoreCase(str8);
		System.out.println("Their lexicographic comparison ignoring case differences: " + f);
		
		System.out.println("Please enter a line:");
		String str9 = sc.nextLine();
		int g = str9.indexOf('a');
		System.out.println("The first index number of the character 'a' in this case is: " + g);
		
		System.out.println("Please enter a line:");
		String str10 = sc.nextLine();
		int h = str10.indexOf('a');
		System.out.println("The last index number of the character 'a' in this case is: " + h);
		
		System.out.println("Please enter a number:");
		String str11 = sc.nextLine();
		String i = str11.valueOf(str11);
		System.out.println("The string representation of the integer argument is: " + i);
		
		sc.close();
	}
}