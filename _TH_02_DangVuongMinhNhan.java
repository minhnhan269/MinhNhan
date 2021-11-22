import java.util.Scanner;
public class tongsonguyen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				System.out.println("nhap so nguyen  thu 1");
			int so1 = input.nextInt();
				System.out.println("nhap so nguyen thu 2");
			int so2 = input.nextInt();
			int kq = so1 + so2;
			System.out.println("so nguyen 1 da nhap: "+so1);
			System.out.println("so nguyen 2  da nhap:"+so2);
			System.out.println("tong cac so nguyen "+kq);
	}
}