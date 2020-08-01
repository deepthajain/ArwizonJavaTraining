import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		caluclateFact();
		
		
		}
	public static void caluclateFact() {
		int number,factorial=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		number= sc.nextInt();
		for(int i=1; i<= number; i++) {
			factorial= factorial*i;
		}
		System.out.println("Factorial of "+number+" is "+ factorial );
		
	}

}

