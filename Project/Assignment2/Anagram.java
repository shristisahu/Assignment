import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String input1 = sc.nextLine();
		System.out.println("Enter second String");
		String input2 = sc.nextLine();

		char[] arr = input1.toCharArray();
		char[] arr2 = input2.toCharArray();

		Arrays.sort(arr);
		Arrays.sort(arr2);

		System.out.println(Arrays.equals(arr, arr2));

	}

}
