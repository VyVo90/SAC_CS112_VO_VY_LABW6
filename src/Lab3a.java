import java.util.Scanner;
public class Lab3a {

	public static void main(String[] args) {
	  Scanner input = new Scanner (System.in);
	  
	  int numb;
	  int min = 0, max = 10;
	  System.out.println("Give a number : ");
	  numb = input.nextInt();
	  
	  int computerNumb;
	  computerNumb = 0 + (int) (Math.random()*10);
	  
	  if(numb > max || numb < min)
		 System.out.printf("The number %d is out of the range!", numb);
	  else {
		  	if (numb > computerNumb)
		  		System.out. printf(" Too big " + "\n The correct number is %d", computerNumb);
		  	else if (numb < computerNumb)
		  		System.out.printf(" Too Small "+ "\n The correct number is %d", computerNumb);
		  	else
		  		System.out.printf("Congrats, correct!");
	  }
	  
	  System.out.printf("The random computer number is %d\n", computerNumb);
	  
	  
	  
		// TODO Auto-generated method stub

	}

}
