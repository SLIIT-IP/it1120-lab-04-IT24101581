import java.util.Scanner;
public class Lab4Q1 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int number = input.nextInt();
		
			if(number>0) {
				System.out.println("The number is positive");
			}
			else if (number<0){
				System.out.println("The number is negative");
			}
			else {
				System.out.print("The number is zero");
			}
	}
}	