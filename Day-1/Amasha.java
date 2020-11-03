import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Amasha{

	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("example.txt"));
		Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String search = input2.next();
		boolean flag = false;
		while (input.hasNextLine()) {
			if(input.nextLine().contains(search)){
				flag = true;
			}
		}
		if(flag){
			System.out.println("Word found in the text file");
		}
		else{
			System.out.println("Word not found in the text file");
		}
	}
}