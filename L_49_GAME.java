  import 
  java.util.Scanner;


/** this is a guess game <p> you can enter a number to guess a rendom number generated
 @author Danish yousuf
 @version 3.0
 @since 2022
 @see javadoc.oracle*/


class game {
	public int number;
	public int inputted;
	public int attempts;

	game() {

		number = (int) (Math.random() * 100);

	}

	public int getInputted() {
		return inputted;
	}

	public void setInputted(int inputted) {

		this.inputted = inputted;
	}

	/**
	 * @return check condition for guessing
	 * 
		*/
	boolean cheack() {
		attempts++;
		if (number == inputted) {
			System.out.println("you guessed it correctly in " + attempts + " number of attempts");
			return true;
		} else if (number > inputted) {
			System.out.println("lower than guessed");
		} else if (number < inputted) {
			System.out.println("greater than guessed");
		}
		return false;
	}

}

public class L_49_GAME {
	/**
	 * @param args this is main method argument
		*/
	public static void main(String[] args) {
		// GUESS A NUMBER
		Scanner sc = new Scanner(System.in);

		game guess = new game();
		boolean b = true;
		while (b) {
			System.out.println("enter a number");
			guess.inputted = sc.nextInt();
			guess.cheack();
		}
		sc.close();

	}
	/**
	 * @param a this is add method argument a
	 * @param b this is add method argument b 
	 * @return sum of two number
		*/
	public int add (int a,int b) {
		int c=a+b;
				return c;
	}

}
