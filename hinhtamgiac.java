package hinhtamgiac;
import java.util.Scanner;

public class hinhtamgiac {
		public static void main(String[] args) {
			int num, n;
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap n: ");
			num = sc.nextInt();
			System.out.println();
			n = num;
			for (int r = 1; r <= num; r++) {
				for (int c = num - r; c >= 1; c--) {
					System.out.print("*");
				}
				for (int c = 1; c <= n; c++) {
					System.out.print("*");
				}
				for (int sp = 1; sp <= r; sp++) {
					System.out.print(" ");
				}
				n--;
				System.out.println();
			}
		}
}