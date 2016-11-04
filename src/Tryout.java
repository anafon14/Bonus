import java.util.Random;
import java.util.Scanner;

public class Tryout {


	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		Random randGenerator = new Random();
		int computerNum;
		int userNum;
		
		do {
		
			computerNum = randGenerator.nextInt(9) + 1;
			
			System.out.println("Guess a number between 1 and 10!");
			userNum = userInput.nextInt();
		
        
        if (userNum==-1){
        	System.out.println("I'm sad to see you leave!");
        }
        
        else{
        	if (userNum == computerNum){
        		System.out.println("Congrats!!! You got the right number! Try again!");
        	} else{
        		System.out.println("Wrong! Try again!");
        	}
        }
        
		} while(userNum != -1);
		
		
		userInput.close();
	
	}
	

}
