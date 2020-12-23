import java.util.Scanner;
import static java.lang.Math.sqrt;

public class F_area{
	
	public double area(int r){
		double result = 2 * 3.14 * r;
		return result;
	}
	
	public double area(int l, int b){
		double result = l * b;
		return result;
	}
	
	public double area(int a, int b, int c){
		double p = (a + b + c) / 2;
		double result = sqrt(p * (p-a) * (p-b) * (p-c));
		return result;
	}
		
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the three parametes for the geometrical shape with zeros for values that don't exist:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double fresult = 0.0;
		F_area f = new F_area();
		
		if(a == 0)
			System.out.println("No parametes were provided.");
		
		else if(b == 0)
			fresult = f.area(a);
			
		else if(c == 0)
			fresult = f.area(a, b);
			
		else
			fresult = f.area(a, b, c);
			
		
	System.out.println("According to the given parametes, the area of the geometrical shape is " + fresult);
		
}
}