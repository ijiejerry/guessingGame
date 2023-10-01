package guessingGame;
import java.util.*;


public class Guessinggame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String name="";
		String ans = "";
		int tries = 0;
		
		while (true) {
			tries++;
			System.out.println("guess a name: ");
			name = "jerry";
			ans = in.nextLine();
			if(ans.equals(name)) {
				System.out.println("Congratulations");
				  System.out.println("Do you want to quit? (y/n)");

				break;
			}
			
			
			else if(ans.equals("y")) {
			 	System.out.println("guesse " + tries);
				break;
			}
			else if(ans.equals("n")) {
				continue;
			}
			
			else {
				  System.out.println("Do you want to quit? (y/n)");

			}
			
			
		}
		
		

	}

}
