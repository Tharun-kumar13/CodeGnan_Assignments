package AssignMents;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RockPaper_Copy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int p1Score = 0;
		int p2Score = 0;

		int n = 1;

		while (n < 9) {

			System.out.println(
					"\n Choose the Option Below : \n Enter 1 to View PLayer 1 Score   \n Enter 2 to view Player 2 Score  \n Enter any Number 3-9 to Continue The Game   \n Enter 10 to Exit : ");
			int n2 = sc.nextInt();
			n = n2;

			if (n == 1) {
				System.out.print("Player 1 SCore : " + p1Score + "\n");

			} else if (n == 2) {
				System.out.print("Player 2 score : " + p2Score + "\n");

			}

			else if (n == 10) {
				System.out.print("Player 1 SCore : " + p1Score + "         Player 2 score : " + p2Score + "\n");
				if (p1Score > p2Score) {
					System.out.print("Player 1 won the Game ...");
				} else if (p1Score == p2Score) {
					System.out.print("results Undeclares...");

				}

				else {
					System.out.print("Player 2 won the Game ...");

				}
				return;

			}

			else {
				System.out.print("Enter Player 1 choice : ");

				String p1 = sc.next().toLowerCase();
				while (!p1.equals("rock") && !p1.equals("paper") && !p1.equals("scessor")) {
					System.out.print("\n****    it is invalid Please enter the valid Player 1 Choi: ");
					p1 = sc.next();
					System.out.println();
				}
				String arr[] = { "rock", "paper", "scessor" };
				String p2 = arr[r.nextInt(3)];

				ArrayList<String> arr2 = new ArrayList<>();
				arr2.add("rock");
				arr2.add("paper");
				arr2.add("scessor");

				if (!arr2.contains(p1)) {
					System.out.print("\n*********    Please Enter valid Input   *************** \n ");
				} else {
					System.out.print("System. choice : " + p2 + "\n");

					if ((p1.equals("rock") && p2.equals("scessor")) || (p1.equals("paper") && p2.equals("rock"))
							|| (p1.equals("scessor") && p2.equals("paper"))) {
						System.out.print("Player 1 Win's \n");
						p1Score += 1;
					} else if (p1.contains(p2)) {
						System.out.print("*****   Un declair / Tie  ***** \n");

					}

					else {
						System.out.print("Player 2 Win's \n");
						p2Score += 1;

					}

				}
			}
		}

	}

}
