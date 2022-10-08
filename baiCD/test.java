package baiCD;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.println("Nhap so luong CD:  ");
		Scanner nhap = new Scanner(System.in);
		int n, choice;
		n = nhap.nextInt();
		CDList dsCD = new CDList(n);
		do {

			System.out.println("Nhap vao choice:  ");
			choice = nhap.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Nhap vao maCD:   ");
				int ma = nhap.nextInt();
				nhap.nextLine();
				System.out.println("Nhap vao tua CD");
				String tuaCD = nhap.nextLine();
				System.out.println("Nhap vao so bai hat");
				int soBaiHat = nhap.nextInt();
				System.out.println("Nhap vao gia Thanh:  ");
				double giaThanh = nhap.nextDouble();
				dsCD.addCD(ma, tuaCD, soBaiHat, giaThanh);
				break;
			}
			case 2:{
				System.out.println("Out:  ");
				System.out.println(dsCD);
				break;
			}

			}

		} while (choice != 0);

	}
}
