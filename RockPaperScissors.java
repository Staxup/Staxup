package hw08;


import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {
public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
		final int ROCK=0;
		final int PAPER=1;
		final int SCISSORS=2;
		Random rand=new Random();
		int seed=in.nextInt();
		rand.setSeed(seed);
	
		System.out.print("Enter first player name: ");
		String name1=in.next();
		System.out.print("Enter second player name: ");
		String name2=in.next();
		System.out.println("Enter number of rounds: ");
	
		int round,player1Rand,player2Rand,count1=0,count2=0;
	
		while(true){
			round=in.nextInt();
			if(round<0){
				System.out.println("Rounds must be >0");
			}else {
				break;
	}
	}
		System.out.println(name1+" vs "+name2+" for "+round+" rounds");
	
		while(true){
			while(round>0) {
	
				player1Rand=rand.nextInt(3);
	
				player2Rand=rand.nextInt(3);
	
				if (player1Rand == player2Rand) {
		System.out.println("Tie");
				} else if (player1Rand == ROCK && player2Rand == PAPER) {
					System.out.println(name2 + " wins because paper covers rock");
					count2++;
				} else if (player1Rand == PAPER && player2Rand == SCISSORS) {
					System.out.println(name2 + " wins because scissors cut paper");
					count2++;
				} else if (player1Rand == SCISSORS && player2Rand == ROCK) {
					System.out.println(name2 + " wins because rock crushes scissors");
					count2++;
				} else if (player2Rand == ROCK && player1Rand == PAPER) {
					System.out.println(name1 + " wins because paper covers rock");
					count1++;
				} else if (player2Rand == PAPER && player1Rand == SCISSORS) {
					System.out.println(name1 + " wins because scissors cut paper");
					count1++;
				} else if (player2Rand == SCISSORS && player1Rand == ROCK) {
					System.out.println(name1 + " wins because rock crushes scissors");
					count1++;
				}
				round--;
			}
	
			if(round<=0){
				break;
	}
	}

		if(count1==count2){
			System.out.println("Tie");
		}else {
			System.out.println(name1 + " wins " + count1 + " and " + name2 + " wins " + count2);
	}
	}
}