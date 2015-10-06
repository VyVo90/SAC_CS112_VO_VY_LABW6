import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int computerNum;
		computerNum = 0 + (int) (Math.random()*10);
	
		int numb;
		System.out.println("Enter a number is :");
		numb = input.nextInt();
		
		if (numb == computerNum)
			System.out.println("Match");
		else
			System.out.println("Wrong");
		
		System.out.printf("The random number is: %d", computerNum);

	}

}
