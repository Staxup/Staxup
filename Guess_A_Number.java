package hw07;

	import java.util.Random;
	import java.util.Scanner;

	public class Guess_A_Number {
	    
	    public static void main(String[] args){

	        Scanner console = new Scanner(System.in);

	        System.out.println("Guess the secret number\n\n");
	        System.out.print("Enter the maximum value for the secret number: ");
	        int maxNum=console.nextInt();

	        Random random = new Random();

	        int guessedNumber = 1+random.nextInt(maxNum);
	        while (true) {
	            System.out.println("\nA new secret number has been choosen.");
	            int userNumber = 0;
	            int guesses = 0;
	            while (userNumber != guessedNumber) {
	                System.out.print("Enter guess: ");
	                userNumber = console.nextInt();
	                guesses++;
	                if (userNumber < guessedNumber) {
	                    System.out.println("Too low; try again.");
	                } else if (userNumber > guessedNumber) {
	                    System.out.println("too high; try again");
	                }
	            }
	            System.out.println("You won in " + guesses + "!");
	            System.out.print("\nPlay again? (Y/N)");
	            console.nextLine();
	            String playAgain = console.nextLine();
	            if(playAgain.equalsIgnoreCase("y")){
	                continue;
	            }else{
	                break;
	            }
	        }

	    }
	}

