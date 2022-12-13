
import java.util.Scanner;
	 

	public class Blackjack2 {

	public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int playerMoney = 2000;
		        int dealerMoney = 2000;

		        while(true) {
		            if(playerMoney == 0) {
		                System.out.println("You cannot pay anymore and cannot play the game!");
		                playerMoney = 2000;
		                dealerMoney = 2000;
		            }
		            if(dealerMoney == 0) {
		                System.out.println("You won the game! The dealer cannot pay anymore!");
		                playerMoney = 2000;
		                dealerMoney = 2000;
		            }
		            int firstPlayerCard = (int) (Math.random() * 10) + 1;
		            int secondPlayerCard = (int) (Math.random() * 10) + 1;
		            int playerTotal = (firstPlayerCard + secondPlayerCard);

		            System.out.println("You have $" + playerMoney);
		            System.out.println("The dealer has $" + dealerMoney);

		            System.out.println("How much money do you want to bet?");
		            int bet = in.nextInt();

		            if(bet == 0 || bet > playerMoney) {
		                System.out.println("You do not have that money please bet again.");
		                bet = in.nextInt();
		            }

		            System.out.println("You drew " + firstPlayerCard + " and " + secondPlayerCard + ".");
		            System.out.println("Your total is: " + playerTotal);

		            int firstDealerCard = (int) (Math.random() * 10) + 1;
		            int secondDealerCard = (int) (Math.random() * 10) + 1;
		            int dealerTotal = (firstDealerCard + secondDealerCard);

		            System.out.println("The dealer drew " + firstDealerCard + " and " + secondDealerCard + ".");
		            System.out.println("The dealer's total is: " + dealerTotal);

		            if(playerTotal > dealerTotal) {
		                System.out.println("You win!");
		                playerMoney += bet;
		                dealerMoney -= bet;
		            } else if(playerTotal == dealerTotal) {
		                System.out.println("It's a tie!");
		            } else {
		                System.out.println("You lose!");
		                playerMoney -= bet;
		                dealerMoney += bet;
		            }



		        }
		    }
		}
	
	
	

				
	           
			
		
		
	

		
		




