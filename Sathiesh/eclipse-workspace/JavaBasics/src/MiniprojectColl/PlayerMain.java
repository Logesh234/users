package MiniprojectColl;

import java.util.Scanner;

public class PlayerMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("==============================================================================");
		System.out.println("================== TEAM MANAGEMENT =========================");
		System.out.println("==============================================================================");
		System.out.println("enter the password\r\n");
		int p1 = sc.nextInt();
		if (p1 == 1234) {
			System.out.println("=======================================================================");
			System.out.println("World cup 2023 Players Information");

			String ch;
			PlayerDet p = new PlayerDet();
			do {

				System.out.println("\t\t 1)playersDetials\r\n" + "\t\t 2)addPlayersInfo.\r\n"
						+ "\t\t 3)removeAllinfo.\r\n" + "\t\t 4)deleteplayerjeryno.\r\n");
				System.out.println("====================================================================");
				System.out.println("Enter your choice:");
				int choice = sc.nextInt();

				switch (choice) {

				case 1:
					p.playersDetials();
					break;
				case 2:
					p.addPlayersInfo();
					break;

				case 3:
					p.removeAllinfo();
					break;
				case 4:
					p.deleteplayerjeryno();
					break;

				default:
					System.out.println("Wrong choice!!");

				}

				System.out.println("Do you want to continue? (Y-Yes / N-No)");
				ch = sc.next();
			} while (ch.equals("Y") || ch.equals("y"));
			System.out.println("====================================================================");

			System.out.println("ThankYou!!!!!!!!!!!!!");

			System.out.println("====================================================================");
		}

		else {
			System.out.println("password is incorrect\n");
			System.out.println("==========================================================================");
		}
	}

}
