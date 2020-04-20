/*
 * 문제 2. 다음 식을 만족하는 모든 A와B 의 조합을 구하는 프로그램을 작성하자
 *		A  B 
 * +	B  A
 * 		9  9
 * 
 */
public class Ex08 {
	public static void main(String[] args) {
		for (int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				if ((10*a+b)+(10*b+a) == 99) {
					System.out.println(" A B\n+B A\n"+" "+a+" " +b);
				}
			}
		}
	}
}
