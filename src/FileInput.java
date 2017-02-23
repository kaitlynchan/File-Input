
import java.io.*;
import java.util.Scanner;
public class FileInput {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner (new File ("./weather.txt"));
		
		double temp2 = input.nextDouble();
		while (input.hasNextDouble()){
		
			double temp1 = input.nextDouble();
			System.out.println("change = " + (temp1-temp2));
			temp2 = temp1;
		}
		input.close();

	}

}
