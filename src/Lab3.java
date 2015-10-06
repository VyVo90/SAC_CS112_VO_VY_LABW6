import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int computerNum;
		computerNum = 0 + (int) (Math.random()*10);
	
		int numb;
		System.out.println("Enter a number is :");
		numb = input.nextInt();
		
		if (numb > computerNum)
			System.out.printf("Too big %d ", numb);
		else if (numb < computerNum)
			System.out.printf("Too small %d ", numb);
		else if (numb == computerNum)
			System.out.printf("Match %d ", numb);
		else
			System.out.println("Wrong");
		
		System.out.printf("The random number is: %d ", computerNum);

	}

}
