package project3;
import java.util.Arrays;
import java.util.Scanner;
public class T34 {
	public static String sort(String s) {
		char[] arr=s.toCharArray();
		Arrays.sort(arr);
		String sor = new String(arr);
		return sor;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(sort(s));
	}
}
