package colours;
import java.util.*;

public class Colours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize two ArrayLists and scanner
		List<String> names = new ArrayList<>(); 
		List<String> colors = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		//for loops to add to Array Lists
		for(int i = 0; i < 5; i++) {
			System.out.println("Please enter a name");
			names.add(scanner.nextLine());
			
		}
		for(int i= 0; i < 5; i++) {
			System.out.println("Please enter a color");
			colors.add(scanner.nextLine());
		}
		//Shuffle color list randomly then turn lists into arrays
		Collections.shuffle(colors);
		String [] nameArray = names.toArray(new String[5]);
		String [] colorArray = colors.toArray(new String [5]);
		//for loop to print out names and colors together
		for(int j = 0; j < 5; j ++) {
			System.out.println(nameArray[j] + "'s color is " + colorArray[j]);
		}
		//close scanner
		scanner.close();
    }
}
