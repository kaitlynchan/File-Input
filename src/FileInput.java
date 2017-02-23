
import java.io.*;
import java.util.Scanner;
public class FileInput {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner (new File ("./weather.txt"));
		double temp1 = input.nextDouble();
		double temp2 = temp1;
		while (input.hasNextDouble()){
			temp1 = input.nextDouble();
			System.out.println("change= " + (temp1-temp2));
		}
		input.close();

	}

}
