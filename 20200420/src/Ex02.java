import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("aaa");

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		// ctrl + shift + f auto align
		switch (input) {
		case 1:
			System.out.println("1input");			break;
		case 2:
			System.out.println("2input");
			break;
		case 3:
			System.out.println("3input");
			break;
		default :
			System.out.println("other");
			break;
		}
	}
}
