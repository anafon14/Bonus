/**

 * Name: Ana Luiza Fonseca Teixeira

 * Teacher: Mr. Hardman 

 * Assignment #3, Bonus Age Program

 * Date Last Modified: 11/04/2016

 */

import java.util.Scanner;

public class Age {

	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int age;
		
		System.out.println("Hello user! How old are you?");
		age = userInput.nextInt();
		
		if (age<16){
			System.out.println("You can't drive!");
		}
		
		else if (age<=17){
			System.out.println("You can drive but not vote!");
			
		}
		
		else if (age<=24){
			System.out.println("You can drive and vote, but you still can't rent a car!");
		}
		
		else {
			System.out.println("You can pretty much do everything!");
		}
		
		userInput.close();
		

	}

}
