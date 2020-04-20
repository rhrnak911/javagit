/*
 * 문제1. 구구단의 짝수 단인 2,4,6,8단만 출력하는 프로그램을 작성하되 2단은
 * 		2x2까지 , 4x4단은 6단은 6x6까지 출력하되 작성하자. 
 */
public class Ex07 {
	public static void main(String[] args) {
		int lesute;

		for (int num = 2; num < 9; num=num+2) {
			for (int i = 1; i < num + 1; i++) {
				lesute = num * i;
				System.out.println(num + "x" + i + " = " + lesute);
			}
		}
	}
}
