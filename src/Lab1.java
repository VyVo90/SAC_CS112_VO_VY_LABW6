import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int computerNum;
		computerNum = 0 + (int) (Math.random()*10);
	
		
		int numb;
		System.out.println("Enter a number is :");
		numb = input.nextInt();
	
		if(numb > computerNum)
			System.out.println("This number is too big");
		
		if(numb < computerNum)
			System.out.println("This number is too small");
		
		if (numb == computerNum)
			System.out.println("This number is correct");
		
		System.out.printf("The random number is: %d", computerNum);
	}

}
