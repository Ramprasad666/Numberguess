package task1;

import java.util.Random;
import java.util.Scanner;

public class Numbergame {

	public static void main(String[] args) {
		int score=10;
		int attempts=10;
		int i=0;
		Scanner sc=new Scanner(System.in);
		
		Random random=new Random();
		int cgv=random.nextInt(101);
		System.out.println(" 1.start the game\n 2.exit the game");
		int userinput=sc.nextInt();
		
		
				
		
		
	
		
		switch(userinput)
		{
		
		
		case 1:
		{
			
			Scanner scn=new Scanner(System.in);
			System.out.println("enter a number between 1-100");

			
			
		while(i<attempts) {
				
			int num=sc.nextInt();
			if (num==cgv) {
				System.out.println("Your guess is right "+cgv);
				System.out.println("you got score of"+" "+((score)-i)+" "+"points");
				return;
			}
			
			else if (num<cgv) {
				System.out.println("Your guessing number is low  enter higher number");
				i++;
				
				
			}
			
			
			else  if(num>cgv) {
				System.out.println("Your guessing number is high enter lower number ");
				i++;
				
				
			}
			
		}
			if(i<=attempts) {
				
				System.out.println();
				System.out.println("your chances are over the system generated number is  "+" "+cgv);
				
			
		}
		}
		
		
		break;
		
		
		
		case 2:
		{
			i=attempts+1;
			System.out.println("thank you visit again");
			String s=sc.next();
			
			
			
		}
		break;
		}
		
	
		
		}
	

}

