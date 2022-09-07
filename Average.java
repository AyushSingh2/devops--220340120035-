import java.util.*;
public class Average {
	public static void main(String args[]){
	   Scanner scan = new Scanner(System.in);  // creating object of Scanner class
	   System.out.println("\"Enter 3 numbers\"");
	   double x = scan.nextDouble();
	   double y = scan.nextDouble();
	   double z = scan.nextDouble();
	   
	   double avg = (x + y + z)/3;
	   
	   System.out.println(avg);
	   scan.close();
	}
	
}